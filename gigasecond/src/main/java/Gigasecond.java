

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

class Gigasecond {
    private LocalDateTime birthDateTime;
    private LocalDate birthDate;

    public Gigasecond(LocalDate birthDate) {
        this.birthDate= birthDate;
    }

    public Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

      LocalDateTime getDate() {
        if(this.birthDate != null){
          LocalDateTime dateTimeToLocalDateTime = LocalDateTime.of(this.birthDate, LocalTime.of(0,0));
          LocalDateTime birthdateResult = dateTimeToLocalDateTime.plus(1000000000, ChronoUnit.SECONDS);
          return  birthdateResult;}

          LocalDateTime birthDateTimeResult =  this.birthDateTime.plus(1000000000, ChronoUnit.SECONDS) ;
          return birthDateTimeResult;
    }


}
