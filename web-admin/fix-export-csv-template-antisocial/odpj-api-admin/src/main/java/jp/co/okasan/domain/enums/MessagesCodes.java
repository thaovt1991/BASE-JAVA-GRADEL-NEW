package jp.co.okasan.domain.enums;


import jp.co.okasan.core.convertor.message.domain.AbstractMessagesCodes;

public enum MessagesCodes implements AbstractMessagesCodes {
    /**
     * Thêm mới ảnh định danh người dùng đăng ký thành công
     */
    CI0005,
    /**
     * Thêm ảnh định dàn người dùng đăng ký thất bại
     */
    DI000005,
    /**
     * Lấy danh sách công ty cổ phiếu thất bại
     */
    DS000001,
    //  Branch update successful
    U07000,
    //  Branch update failed
    D0007500,

    /**
     * Cập nhật thành công
     */
    I000001,
    /**
     * Lấy danh sách resource info thất bại
     */
    DV000501,

    /**
     * Lấy danh sách văn bản đã ban hành thất bại
     */
    DV000500,

    /**
     * Cập nhật thông tin gửi hoặc rút tiền thất bại
     */
    DF010500,

    /**
     * Cập nhật thông tin gửi hoặc rút tiền thành công
     */
    UF01200,
    /*Check customer information successfully*/
    UW0002,
    /*  Customer enters stock that does not exist*/
    VM000404,
    /*Customers issue bonds that do not exist*/
    VW000404,

    //  Successfully added new branch
    C0007000,
    //  Newly added branch already exists
    V0007000,
    //  Export csv file of branch list successfully
    E11000,
    //  Exporting csv file of branch list failed
    E1001000,
    //  Exporting csv file of branch list failed
    D1001000,
    //  Successful transaction update
    D0000502,
    /**
     * Get Lock Info fail
     */
    RUW404,
    DW000508,
    // Error update
    DS000002,
    // Not found
    DS000003,
    // Success update
    CI0006,
    ED000502,
    DG0500,
    //Getting master message failed
    DM07500,
    RM0001,
    DM000001,
    RY0002,
    DE000002,
    //Get customer fail
    RG5000,

    DY000501,
    R000002,
    VU000002,
    UI0003,
    UI000003,
    /**
     * Lấy danh sách công ty cổ phiếu thất bại
     */
    DS000009,
    /**
     * Cập nhật khóa mở khóa tài khoản thất bại
     */
    DU000509,
    /**
     * Cập nhật khóa mở khóa tài khoản thành công
     */
    CU0009,
    /**
     * Lấy thông tin về quyền lợi của trái phiếu thất bại
     */
    RY000509,
    /**
     * Lấy thông tin về quyền lợi của trái phiếu thành công
     */
    RY000009,
    /**
     * Import danh sách cổ phiếu thành công
     */
    RT000009,
    /**
     * Import danh sách cổ phiếu thất bại
     */
    DT000500,
    /**
     * Import danh sách cổ phiếu thất bại
     */
    VT000500,
    UU0001,

    SU000002,
    DU000002,

    D0000200,
    D0000500,
    EU000002
    ;
}
