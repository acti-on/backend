package actiOn.review.dto;

import actiOn.helper.validator.NotSpace;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

@Getter
@Builder
@AllArgsConstructor
public class ReviewPostDto {
    @NotSpace
    private String content;

    @Range(min = 0, max = 5)
    @NotNull
    private Integer rating;
}
