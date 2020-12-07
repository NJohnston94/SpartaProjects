package com.sparta.nathan;

public class DataTypesAndWrapperClasses {
    //Integer types - primitive
    byte    numberOne   = 7;        //1 byte
    short   numberTwo   = 28;       //2 bytes
    int     numberThree = 496;      //4 bytes
    long    numberFour  = 83254;    //8 bytes

    //Decimal types - primitive
    float   numberFive  = 5.264f;   /*4 bytes; up to 7dp,
                                      leftmost bit is 0=+ve, 1=-ve*/
    double  numberSix   = 4.857692d;/*8 bytes; up to 16dp,
                                      leftmost bit is 0=+ve, 1=-ve
                                      next 7 bits are exponent*/

    //Character (Char) types - primitive
    char character; /*16 bits; 8 bits for ASCII 0-255
                               8 bits for Unicode symbols*/

}
