package LinkShortener.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record CreateLinkRequest(

    @NotBlank(message="URL cannot be null or empty")
    @Pattern(
            regexp = "https?://.*",
            message = "URL must start with http or https"
    )
    String originalUrl

){}
