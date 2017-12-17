/**
 * Created by Administrator on 2017/10/2.
 */
$(function(){
    //增加了手机验证正则
    jQuery.validator.addMethod("checkPhone",function(value,element){
        var tel = /^(((13[0-9]{1})|(15[0-9]{1}))+\d{8})$/
        return this.optional(element) || (tel.test(value));
    },"电话号码格式不正确")

})