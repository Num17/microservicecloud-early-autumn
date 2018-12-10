package com.early.autumn.common.constant.user;

public enum GenderEnum {

    MAN("男", 0),
    WOMAN("女", 1);

    private String value;
    private int index;

    GenderEnum(String value, int index) {
        this.value = value;
        this.index = index;
    }

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
