package finalproject.com.example.demo.enums;

public enum ResultEnum {
   PARAM_ERROR(1,"Parametrer_error");




    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
