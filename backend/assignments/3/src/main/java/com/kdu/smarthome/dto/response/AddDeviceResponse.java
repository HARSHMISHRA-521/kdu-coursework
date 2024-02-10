package com.kdu.smarthome.dto.response;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * A DTO (Data Transfer Object) for responses after adding a device to the inventory or a house.
 * It encapsulates the outcome message, additional object information, and the HTTP status of the operation.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddDeviceResponse {

    /**
     * The message indicating the result of the add device operation.
     * It provides feedback such as success or failure reasons.
     */
    @NotBlank(message = "Message field should not be an empty field")
    private String message;

    /**
     * Additional information about the device that was added.
     */
    @NotBlank(message = "Additional field should not be empty")
    private String additionalInfo;

    /**
     * The HTTP status code resulting from the add device operation.
     * It helps in understanding the outcome (e.g., success, error) at the HTTP level.
     */
    @NotBlank(message = "HTTP Status field should not be empty")
    private HttpStatus httpStatus;
}
