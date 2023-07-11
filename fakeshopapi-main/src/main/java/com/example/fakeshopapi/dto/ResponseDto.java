package com.example.fakeshopapi.dto;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseDto<T> {
    private boolean success;
    private List<T> response;
    private List<T> error;


//
//    public static <T> ApiResult<T> success(T response) {
//        return new ApiResult<>(true, response, null);
//    }
//
//    public static ApiResult<?> error(String message, HttpStatus status) {
//        return new ApiResult<>(false, null, new ApiError(message, status.value()));
//    }
//
//    @Getter
//    @Setter @AllArgsConstructor
//    public static class ApiResult<T> {
//        private final boolean success;
//        private final T response;
//        private final ApiError error;
//    }
//
//    @Getter @Setter @AllArgsConstructor
//    public static class ApiError {
//        private final String message;
//        private final int status;
//    }
}
