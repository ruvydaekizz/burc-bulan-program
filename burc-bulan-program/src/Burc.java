import java.sql.SQLOutput;
import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {

        /*
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
        */
        Scanner input = new Scanner(System.in);

        System.out.println("------SWITCH CASE İLE YAZIMI------");

        int month, day;

        String burc = " ";

        boolean isError = false;

        System.out.print("Doğduğunuz ay : ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün: ");
        day = input.nextInt();


        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    isError = true;
                }
                break;

            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                } else {
                    isError = true;
                }
                break;

            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        burc = "Balık";
                    } else {
                        burc = "Koç";
                    }
                } else {
                    isError = true;
                }
                break;

            case 4:
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                } else {
                    isError = true;
                }
                break;

            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";
                    }
                } else {
                    isError = true;
                }
                break;

            case 6:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc = "İkizler";
                    } else {
                        burc = "Yengeç";
                    }
                } else {
                    isError = true;
                }
                break;

            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Yengeç";
                    } else {
                        burc = "Aslan";
                    }
                } else {
                    isError = true;
                }
                break;

            case 8:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Aslan";
                    } else {
                        burc = "Başak";
                    }
                } else {
                    isError = true;
                }
                break;

            case 9:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        burc = "Başak";
                    } else {
                        burc = "Terazi";
                    }
                } else {
                    isError = true;
                }
                break;

            case 10:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                } else {
                    isError = true;
                }
                break;

            case 11:
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                } else {
                    isError = true;
                }
                break;

            case 12:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Yay";
                    } else {
                        burc = "Oğlak";
                    }
                } else {
                    isError = true;
                }
                break;

            default:
                isError = true;
        }

        if (isError) {
            System.out.println("Hatalı Giriş Yaptınız, tekrar deneyiniz!!");
        } else {
            System.out.println("Burcunuz: " + burc);
        }


        System.out.println("---------IF-ELSE İLE YAZIMI----------");

        int month1, day1;

        String burc1 = "";

        boolean calisti = false;

        System.out.print("Hangi ayda doğdunuz: ");
        month1 = input.nextInt();

        System.out.print("Hangi günde doğdunuz: ");
        day1 = input.nextInt();


        if (month1 == 1) {
            if (day >= 1 && day <= 31) {
                if (day1 >= 1 && day1 <= 21) {
                    burc1 = "Oğlak";
                } else {
                    burc1 = "Kova";
                }
            } else {
                calisti = true;
            }

        } else if (month1 == 2) {
            if (day >= 1 && day <= 29) {
                if (day1 >= 1 && day1 <= 19) {
                    burc1 = "Kova";
                } else {
                    burc1 = "Balık";
                }
            } else {
                calisti = true;
            }

        } else if (month1 == 3) {
            if (day1 >= 1 && day <= 31) {
                if (day1 >= 1 && day <= 20) {
                    burc1 = "Balık";
                } else {
                    burc1 = "Koç";
                }
            } else {
                calisti = true;
            }

        } else if (month1 == 4) {
            if (day >= 1 && day <= 30) {
                if (day1 >= 1 && day <= 20) {
                    burc1 = "Koç";
                } else {
                    burc1 = "Boğa";
                }
            } else {
                calisti = true;
            }

        } else if (month1 == 5) {
            if (day >= 1 && day <= 31) {
                if (day1 >= 1 && day <= 21) {
                    burc1 = "Boğa";
                } else {
                    burc1 = "İkizler";
                }
            } else {
                calisti = true;
            }


        } else if (month1 == 6) {
            if (day >= 1 && day <= 30) {
                if (day1 >= 1 && day <= 22) {
                    burc1 = "İkizler";
                } else {
                    burc1 = "Yengeç";
                }
            } else {
                calisti = true;
            }


        } else if (month1 == 7) {
            if (day >= 1 && day <= 31) {
                if (day1 >= 1 && day <= 22) {
                    burc1 = "Yengeç";
                } else {
                    burc1 = "Aslan";
                }
            } else {
                calisti = true;
            }


        } else if (month1 == 8) {
            if (day >= 1 && day <= 31) {
                if (day1 >= 1 && day <= 22) {
                    burc1 = "Aslan";
                } else {
                    burc1 = "Başak";
                }
            } else {
                calisti = true;
            }


        } else if (month1 == 9) {
            if (day >= 1 && day <= 30) {
                if (day1 >= 1 && day <= 22) {
                    burc1 = "Başak";
                } else {
                    burc1 = "Terazi";
                }
            } else {
                calisti = true;
            }


        } else if (month1 == 10) {
            if (day >= 1 && day <= 31) {
                if (day1 >= 1 && day <= 22) {
                    burc1 = "Terazi";
                } else {
                    burc1 = "Akrep";
                }
            } else {
                calisti = true;
            }


        } else if (month1 == 11) {
            if (day >= 1 && day <= 30) {
                if (day1 >= 1 && day <= 21) {
                    burc1 = "Akrep";
                } else {
                    burc1 = "Yay";
                }
            } else {
                calisti = true;
            }


        } else if (month1 == 12) {
            if (day >= 1 && day <= 31) {
                if (day1 >= 1 && day <= 21) {
                    burc1 = "Yay";
                } else {
                    burc1 = "Oğlak";
                }
            } else {
                calisti = true;
            }
        }

        if (calisti) {
            System.out.println("Hatalı Giriş Yaptınız, tekrar deneyiniz!!");
        } else {
            System.out.println("Burcunuz: " + burc1);
        }
    }
}
