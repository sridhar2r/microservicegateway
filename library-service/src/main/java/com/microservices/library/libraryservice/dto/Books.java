package com.microservices.library.libraryservice.dto;

import lombok.*;


import java.time.LocalDate;

/**
 * Created by sridharrajagopal on 6/2/22.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Books {
    private Users users;
    private String bookName;
    private String isin;
    private LocalDate dateOfReturn;
}
