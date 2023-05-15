public class Teszt {
    // HALLGATÓK
    Hallgato h1 = new NappaliHallgato("ABC123", "Gipsz Jakab", "gipszjakab@sze.hu", "063012345678", false);
    Hallgato h2 = new NemzetkoziHallgato("CDE456", "Hans von Rotbandenberger", "hans@sze.hu", "06701231423", "osztrák");
    Hallgato h3 = new LevelezosHallgato("HUN123", "Csák Ányos", "csak.anyos@sze.hu", "06204373443", 55);
    Hallgato h4 = new LevelezosHallgato("HUN345", "Cserepesné Kiss Virág", "cskissvirag@sze.hu", "062055555555", 178);
    Hallgato h5 = new NappaliHallgato("AKC555", "Akciós Áron", "akcios.aron@sze.hu", "063033333333", true);
    Hallgato h6 = new NappaliHallgato("BBB111", "Kukor Ilona", "kukorica@sze.hu", "062011111111", true);
    Hallgato h7 = new NemzetkoziHallgato("AAA999", "Majse Greestem", "majse@sze.hu", "0630999999999", "norvég");

    // TANTÁRGYAK
    Tantargy t1 = new Tantargy("GKLB_INTM037", "Java programozás", 6, "Varjasi Norbert", "Java");
    Tantargy t2 = new Tantargy("EKLB_KETM029", "CAD alkalmazások 1.", 4, "Horváth Zsolt", "AutoCAD");
    Tantargy t3 = new Tantargy("GKLB_INTM042", "Portálfejlesztés .NET-ben", 6, "Galli Richárd", "Portál");
    Tantargy t4 = new Tantargy("GKLB_INTM097", "Szakdolgozati konzultáció II.", 6, "Takács Gábor", "Szakdoga 2");

    // TANULMÁNYI RENDSZER
    TanulmanyiRendszer tr = new TanulmanyiRendszer("Széchenyi István Egyetem", "9024 Győr, Egyetem tér 1.", "0696555555");
}
