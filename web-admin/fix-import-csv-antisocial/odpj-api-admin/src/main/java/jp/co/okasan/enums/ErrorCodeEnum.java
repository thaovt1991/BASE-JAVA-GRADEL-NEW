package jp.co.okasan.enums;

import jp.co.okasan.core.convertor.message.domain.AbstractMessagesCodes;

public enum ErrorCodeEnum implements AbstractMessagesCodes{

    R0000001("EMAIL_VALID"),
    VE000001("EMAIL_EXISTED"),
    D0000001("VERIFY_EMAIL_FAIL"),
    DR000001("Register email fail"),
    RT0001("Get email template success"),
    DT000001("Get email template fail"),
    V01000("URL Invalid"),
    V0001000("URL was expired"),
    V0001404("URL Invalid"),
    V0001500("Checking URL is fail"),
    DS000001("Get stock companies fail"),
    RT9999("Get list name identification success"),
    DI000002("Get list name identification fail"),
    UU0001("Update Information User Success"),
    DU000003("Update Information User Fail"),
    VU000001("Invalid registration URL"),
    VI000003("User is not exist"),
    UI0003("Update identify user success"),
    DI000003("Update identify user fail"),
    VU000404("No data to Export"),
    RU0002("Export csv successful"),
    DE000002("Export csv failed"),
    RM0001("Get remark info success"),
    DM000001("Get remark info fail"),
    DU000002("Search for the register user information failed"),
    SU000002("Search for the register user information failed"),
    DG0500("Get user information failed"),
    DZ000500("Get deposit and withdrawal history information failed"),
    DY000501("Get list bond discreption fail"),
    RY0001("Get list bond discreption success"),
    ;

    ErrorCodeEnum(String message) {
        this.message = message;
    }

    private String message;

    public String getMessage() {
        return message;
    }
}
