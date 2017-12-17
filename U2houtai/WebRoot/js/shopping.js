/**
 * Created by Administrator on 2017/9/21.
 */
//总价格计算方法
function total_prices() {
    var total = 0;
    $(".danjia").each(function () {
        if ($(this).prev().prev().prev().prev().prev().children().attr("checked")) {
            total += parseInt($(this).text());
        }
    })
    return total;
}

//动态显示
function showAll() {
    $("#total_value").text(total_prices());
}


$(function () {
    $(".Remove").click(function () {
        $(this).parent().remove();
    })
    //减少的方法
    $(".minus").click(function () {
        var $amount = $(this).next().val();
        var count = (parseInt($amount) - 1);
        if (count < 1) {
            alert("不能在减少了。");
        } else {
            $(this).next().val(count);
            var price = parseInt($(this).parents(".sub_content").prev().text());
            var total = price * count;
            $(this).parents(".sub_content").next().text(total);
        }
        showAll();
    })
    //增加的方法
    $(".add").click(function () {
        var $amount = $(this).prev().val();
        var count = (parseInt($amount) + 1);
        $(this).prev().val(count);
        var $price = parseInt($(this).parent().parent().prev().text());
        var total = $price * count;
        $(this).parent().parent().next().text(total);
        showAll();
    })
        //全选方法
    $("#allCheckBox").click(function () {
        if($(this).attr("checked")){
            $("[ name='cartCheckBox']").attr("checked", "true");
            showAll();
        }else{
            $("[ name='cartCheckBox']").removeAttr("checked");
            showAll();
        }
    });
   //单个按钮
    $(".quanxuan").click(function(){
        if($(this).attr("checked")){
            $(this).attr("checked", true);
            showAll();
        }else{
        $(this).removeAttr("checked");
            showAll();
        }
    })


})