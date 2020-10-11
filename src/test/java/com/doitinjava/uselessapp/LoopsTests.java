package com.doitinjava.uselessapp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class LoopsTests {

    @Test
    public void loopSuccessTest() {

        final Integer totalRealizations = 3;
        final Integer totalBills = 2;

        //  Список документов
        List<String> documents = List.of(
                "Реализация товаров услуг № 1 от 10.10.2020",
                "Cчёт на оплату № 1 от 10.10.2020",
                "Cчёт на оплату № 2 от 11.10.2020",
                "Реализация товаров услуг № 2 от 10.10.2020",
                "Реализация товаров услуг № 3 от 11.10.2020"
        );

        Integer realizations = 0;
        Integer bills = 0;
        //  Напиши цикл по списку документов documents, который увеличит значения realizations и bills так,
        //  чтобы они были равен totalRealizations и totalBills соответственно
        //  Цикл пиши ниже:

        //  Конец цикла
        Assertions.assertThat(realizations).isEqualTo(totalRealizations);
        Assertions.assertThat(bills).isEqualTo(totalBills);
    }
}
