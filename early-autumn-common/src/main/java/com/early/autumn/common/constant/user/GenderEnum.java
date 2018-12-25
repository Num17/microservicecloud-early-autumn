package com.early.autumn.common.constant.user;

import com.early.autumn.common.handler.BaseEnum;

public enum GenderEnum implements BaseEnum<GenderEnum> {

    MAN(0, "男"),
    WOMAN(1, "女");

    private int code;
    private String value;

    GenderEnum(int code, String value) {
        this.code = code;
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    //TODO 与上述方法一起有点怪异，后续优化
    public int getCode() {
        return code;
    }

    public String valueOf(int code) {
        for (GenderEnum genderEnum : values()) {
            if (genderEnum.getCode() == code) {
                return genderEnum.value;
            }
        }

        throw new RuntimeException("没有找到对应的枚举值：" + code);

    }

}
