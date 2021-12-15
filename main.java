public class main {
    public static void main(String[] args) {
        AFC_East AFC_East[] = new AFC_East[4];
        AFC_East[0] = new AFC_East("Buffalo Bills", 7, 6, 2 );
        AFC_East[1] = new AFC_East("New England Patriots", 9, 4, 1);
        AFC_East[2] = new AFC_East("Miami Dolphins", 6, 7, 3);
        AFC_East[3] = new AFC_East("New York Jets", 3, 10, 4);

        AFC_North AFC_North[] = new AFC_North[4];
        AFC_North[0] = new AFC_North("Baltimore Ravens", 8, 5, 1);
        AFC_North[1] = new AFC_North("Cleveland Browns", 7, 6, 2);
        AFC_North[2] = new AFC_North("Cincinnati Bengals", 7, 6, 3);
        AFC_North[3] = new AFC_North("Pittsburg Steelers", 6, 6, 4);


        AFC_West AFC_West[] = new AFC_West[4];
        AFC_West[0] = new AFC_West("Kansas City Chiefs", 9, 4, 1);
        AFC_West[1] = new AFC_West("Los Angeles Chargers", 8, 5, 2);
        AFC_West[2] = new AFC_West("Denver Broncos", 7, 6, 3);
        AFC_West[3] = new AFC_West("Las Vegas Raiders", 6, 7, 4);

        AFC_South AFC_South[] = new AFC_South[4];
        AFC_South[0] = new AFC_South("Tenessee Titans", 9, 4, 1);
        AFC_South[1] = new AFC_South("Indianapolis Colts", 7, 6, 2);
        AFC_South[2] = new AFC_South("Houston Texaz", 2, 11, 3);
        AFC_South[3] = new AFC_South("JacksonVille Jaguars", 2, 11, 4);

        NFC_East NFC_East[] = new NFC_East[4];
        NFC_East[0] = new NFC_East("Dallas Cowboys", 9, 4, 1);
        NFC_East[1] = new NFC_East("Washington", 6, 7, 2);
        NFC_East[2] = new NFC_East("Philadelphia Eagles", 6, 7, 3);
        NFC_East[3] = new NFC_East("New York Giants", 4, 9, 4);
        
        NFC_North NFC_North[] = new NFC_North[4];
        NFC_North[0] = new NFC_North("Green Bay Packers", 10, 3, 1);
        NFC_North[1] = new NFC_North("Minnesota Vikings", 6, 7, 2);
        NFC_North[2] = new NFC_North("Chicago Bears", 4, 9, 3);
        NFC_North[3] = new NFC_North("Detroit Lions", 1, 11, 4);


        NFC_West NFC_West[] = new NFC_West[4];
        NFC_West[0] = new NFC_West("Arizona Cardinals", 10, 3, 1);
        NFC_West[1] = new NFC_West("Los Angeles Rams", 9, 4, 2);
        NFC_West[2] = new NFC_West("San Francisco 49ers", 7, 6, 3);
        NFC_West[3] = new NFC_West("Seattle Seahawks", 5, 8, 4);


        NFC_South NFC_South[] = new NFC_South[4];
        NFC_South[0] = new NFC_South("Tampa Bay", 10, 3, 1);
        NFC_South[1] = new NFC_South("Atlanta Falcons", 6, 7, 2);
        NFC_South[2] = new NFC_South("New Orleans Saints", 6, 7, 3);
        NFC_South[3] = new NFC_South("Carolina Panthers", 5, 8, 4);
        //

        System.out.println(AFC_East[0].toString());
        System.out.println(AFC_West[1].toString());
    }

}
