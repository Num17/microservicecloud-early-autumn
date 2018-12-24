package com.early.autumn.common.constant.user;

import com.early.autumn.common.handler.BaseEnum;

public enum GenderEnum implements BaseEnum<GenderEnum> {

    MAN("男", 0),
    WOMAN("女", 1);

    private String value;
    private int index;

    GenderEnum(String value, int index) {
        this.value = value;
        this.index = index;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    public int getIndex() {
        return this.index;
    }

    public String valueOf(int index) {
        for (GenderEnum genderEnum : values()) {
            if (genderEnum.getIndex() == index) {
                return genderEnum.getValue();
            }
        }

        throw new RuntimeException("没有找到对应的枚举值：" + index);

    }

}
