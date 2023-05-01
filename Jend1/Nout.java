package Jend1;

public class Nout {

    int number;
    int ozu;
    int Vgd;
    String Op;
    String Color;

    {
        number = 0;
        ozu = 0;
        Vgd = 0;
        Op = " ";
        Color = " ";
    }

    Nout() {
    };

    Nout(int number, int ozu, int Vgd, String Op, String Color) {
        this.number = number;
        this.ozu = ozu;
        this.Vgd = Vgd;
        this.Op = Op;
        this.Color = Color;
    }

    public void PrintNout() {
        System.out .println("№ " + number + " ОЗУ:" + ozu + " Объем ЖД:" + Vgd + " Операционка:" + Op + " Цвет:" + Color);
    }

}
