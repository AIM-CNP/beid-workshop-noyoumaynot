package han.aim.se.noyoumaynot.movie.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    private String movieid;
    private String name;
}
