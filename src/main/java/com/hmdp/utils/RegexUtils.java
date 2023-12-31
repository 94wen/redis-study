package com.hmdp.utils;

import cn.hutool.core.util.StrUtil;

/**
 * @author 虎哥
 */
public class RegexUtils {
    /**
     * 是否是无效手机格式
     * @param phone 要校验的手机号
     * @return true:符合，false：不符合
     */
    public static boolean isPhoneInvalid(String phone){
        return mismatch(phone, RegexPatterns.PHONE_REGEX);
    }
    /**
     * 是否是无效邮箱格式
     * @param email 要校验的邮箱
     * @return true:符合，false：不符合
     */
    public static boolean isEmailInvalid(String email){
        return mismatch(email, RegexPatterns.EMAIL_REGEX);
    }

    /**
     * 是否是无效验证码格式
     * @param code 要校验的验证码
     * @return true:符合，false：不符合
     */
    public static boolean isCodeInvalid(String code){
        return mismatch(code, RegexPatterns.VERIFY_CODE_REGEX);
    }

    // 校验是否不符合正则格式
    private static boolean mismatch(String str, String regex){
        //如果为空，相当于if(true),不为空，返回false
        if (StrUtil.isBlank(str)) {
            return true;
        }
        //if语句得到false，执行下面return，matches返回true，return返回false
        return !str.matches(regex);
        //调用该方法时，返回false则表示 ，电话号码不为空且符合校验格式
    }
}
