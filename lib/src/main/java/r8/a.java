package r8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import k9.h;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap f26668a = new HashMap();

    private static String a(String str) {
        char[] charArray = str.toCharArray();
        boolean zIsWhitespace = true;
        for (int i10 = 0; i10 < charArray.length; i10++) {
            if (zIsWhitespace && Character.isLetter(charArray[i10])) {
                charArray[i10] = Character.toUpperCase(charArray[i10]);
            }
            zIsWhitespace = Character.isWhitespace(charArray[i10]);
        }
        return String.valueOf(charArray);
    }

    public static String b(String str, String str2) {
        if (str == null || str2 == null) {
            return "";
        }
        try {
            return "lowercase".equals(str2) ? str.toLowerCase() : "UPPERCASE".equals(str2) ? str.toUpperCase() : "CapitalizeAllFirst".equals(str2) ? a(str) : "CapitalizeFirst".equals(str2) ? e(str) : "cent".equals(str2) ? h(str) : "dollar".equals(str2) ? r(str) : "comma".equals(str2) ? i(str) : "euro".equals(str2) ? s(str) : "jpy".equals(str2) ? t(str) : "lira".equals(str2) ? u(str) : "M-d-y".equals(str2) ? j(str) : "m-d-y".equals(str2) ? k(str) : "M d y".equals(str2) ? l(str) : "M d Y".equals(str2) ? m(str) : "l".equals(str2) ? n(str) : "M d".equals(str2) ? o(str) : "H:i".equals(str2) ? p(str) : "m-d-y H:i".equals(str2) ? q(str) : str;
        } catch (Exception e5) {
            h.o(e5);
            return str;
        }
    }

    private static Map c() {
        HashMap map = f26668a;
        if (map.isEmpty()) {
            map.put("AD", "Andorra");
            map.put("AE", "United Arab Emirates");
            map.put("AF", "Afghanistan");
            map.put("AG", "Antigua and Barbuda");
            map.put("AI", "Anguilla");
            map.put("AL", "Albania");
            map.put("AM", "Armenia");
            map.put("AO", "Angola");
            map.put("AP", "Asia/Pacific Region");
            map.put("AQ", "Antarctica");
            map.put("AR", "Argentina");
            map.put("AS", "American Samoa");
            map.put("AT", "Austria");
            map.put("AU", "Australia");
            map.put("AW", "Aruba");
            map.put("AX", "Aland Islands");
            map.put("AZ", "Azerbaijan");
            map.put("BA", "Bosnia and Herzegovina");
            map.put("BB", "Barbados");
            map.put("BD", "Bangladesh");
            map.put("BE", "Belgium");
            map.put("BF", "Burkina Faso");
            map.put("BG", "Bulgaria");
            map.put("BH", "Bahrain");
            map.put("BI", "Burundi");
            map.put("BJ", "Benin");
            map.put("BL", "Saint Bartelemey");
            map.put("BM", "Bermuda");
            map.put("BN", "Brunei Darussalam");
            map.put("BO", "Bolivia");
            map.put("BQ", "Bonaire, Saint Eustatius and Saba");
            map.put("BR", "Brazil");
            map.put("BS", "Bahamas");
            map.put("BT", "Bhutan");
            map.put("BV", "Bouvet Island");
            map.put("BW", "Botswana");
            map.put("BY", "Belarus");
            map.put("BZ", "Belize");
            map.put("CA", "Canada");
            map.put("CC", "Cocos (Keeling) Islands");
            map.put("CD", "Congo, The Democratic Republic of the");
            map.put("CF", "Central African Republic");
            map.put("CG", "Congo");
            map.put("CH", "Switzerland");
            map.put("CI", "Cote d'Ivoire");
            map.put("CK", "Cook Islands");
            map.put("CL", "Chile");
            map.put("CM", "Cameroon");
            map.put("CN", "China");
            map.put("CO", "Colombia");
            map.put("CR", "Costa Rica");
            map.put("CU", "Cuba");
            map.put("CV", "Cape Verde");
            map.put("CW", "Curacao");
            map.put("CX", "Christmas Island");
            map.put("CY", "Cyprus");
            map.put("CZ", "Czech Republic");
            map.put("DE", "Germany");
            map.put("DJ", "Djibouti");
            map.put("DK", "Denmark");
            map.put("DM", "Dominica");
            map.put("DO", "Dominican Republic");
            map.put("DZ", "Algeria");
            map.put("EC", "Ecuador");
            map.put("EE", "Estonia");
            map.put("EG", "Egypt");
            map.put("EH", "Western Sahara");
            map.put("ER", "Eritrea");
            map.put("ES", "Spain");
            map.put("ET", "Ethiopia");
            map.put("EU", "Europe");
            map.put("FI", "Finland");
            map.put("FJ", "Fiji");
            map.put("FK", "Falkland Islands (Malvinas)");
            map.put("FM", "Micronesia, Federated States of");
            map.put("FO", "Faroe Islands");
            map.put("FR", "France");
            map.put("GA", "Gabon");
            map.put("GB", "United Kingdom");
            map.put("GD", "Grenada");
            map.put("GE", "Georgia");
            map.put("GF", "French Guiana");
            map.put("GG", "Guernsey");
            map.put("GH", "Ghana");
            map.put("GI", "Gibraltar");
            map.put("GL", "Greenland");
            map.put("GM", "Gambia");
            map.put("GN", "Guinea");
            map.put("GP", "Guadeloupe");
            map.put("GQ", "Equatorial Guinea");
            map.put("GR", "Greece");
            map.put("GS", "South Georgia and the South Sandwich Islands");
            map.put("GT", "Guatemala");
            map.put("GU", "Guam");
            map.put("GW", "Guinea-Bissau");
            map.put("GY", "Guyana");
            map.put("HK", "Hong Kong");
            map.put("HM", "Heard Island and McDonald Islands");
            map.put("HN", "Honduras");
            map.put("HR", "Croatia");
            map.put("HT", "Haiti");
            map.put("HU", "Hungary");
            map.put("ID", "Indonesia");
            map.put("IE", "Ireland");
            map.put("IL", "Israel");
            map.put("IM", "Isle of Man");
            map.put("IN", "India");
            map.put("IO", "British Indian Ocean Territory");
            map.put("IQ", "Iraq");
            map.put("IR", "Iran, Islamic Republic of");
            map.put("IS", "Iceland");
            map.put("IT", "Italy");
            map.put("JE", "Jersey");
            map.put("JM", "Jamaica");
            map.put("JO", "Jordan");
            map.put("JP", "Japan");
            map.put("KE", "Kenya");
            map.put("KG", "Kyrgyzstan");
            map.put("KH", "Cambodia");
            map.put("KI", "Kiribati");
            map.put("KM", "Comoros");
            map.put("KN", "Saint Kitts and Nevis");
            map.put("KP", "Korea, Democratic People's Republic of");
            map.put("KR", "Korea, Republic of");
            map.put("KW", "Kuwait");
            map.put("KY", "Cayman Islands");
            map.put("KZ", "Kazakhstan");
            map.put("LA", "Lao People's Democratic Republic");
            map.put("LB", "Lebanon");
            map.put("LC", "Saint Lucia");
            map.put("LI", "Liechtenstein");
            map.put("LK", "Sri Lanka");
            map.put("LR", "Liberia");
            map.put("LS", "Lesotho");
            map.put("LT", "Lithuania");
            map.put("LU", "Luxembourg");
            map.put("LV", "Latvia");
            map.put("LY", "Libyan Arab Jamahiriya");
            map.put("MA", "Morocco");
            map.put("MC", "Monaco");
            map.put("MD", "Moldova, Republic of");
            map.put("ME", "Montenegro");
            map.put("MF", "Saint Martin");
            map.put("MG", "Madagascar");
            map.put("MH", "Marshall Islands");
            map.put("MK", "Macedonia");
            map.put("ML", "Mali");
            map.put("MM", "Myanmar");
            map.put("MN", "Mongolia");
            map.put("MO", "Macao");
            map.put("MP", "Northern Mariana Islands");
            map.put("MQ", "Martinique");
            map.put("MR", "Mauritania");
            map.put("MS", "Montserrat");
            map.put("MT", "Malta");
            map.put("MU", "Mauritius");
            map.put("MV", "Maldives");
            map.put("MW", "Malawi");
            map.put("MX", "Mexico");
            map.put("MY", "Malaysia");
            map.put("MZ", "Mozambique");
            map.put("NA", "Namibia");
            map.put("NC", "New Caledonia");
            map.put("NE", "Niger");
            map.put("NF", "Norfolk Island");
            map.put("NG", "Nigeria");
            map.put("NI", "Nicaragua");
            map.put("NL", "Netherlands");
            map.put("NO", "Norway");
            map.put("NP", "Nepal");
            map.put("NR", "Nauru");
            map.put("NU", "Niue");
            map.put("NZ", "New Zealand");
            map.put("OM", "Oman");
            map.put("PA", "Panama");
            map.put("PE", "Peru");
            map.put("PF", "French Polynesia");
            map.put("PG", "Papua New Guinea");
            map.put("PH", "Philippines");
            map.put("PK", "Pakistan");
            map.put("PL", "Poland");
            map.put("PM", "Saint Pierre and Miquelon");
            map.put("PN", "Pitcairn");
            map.put("PR", "Puerto Rico");
            map.put("PS", "Palestinian Territory");
            map.put("PT", "Portugal");
            map.put("PW", "Palau");
            map.put("PY", "Paraguay");
            map.put("QA", "Qatar");
            map.put("RE", "Reunion");
            map.put("RO", "Romania");
            map.put("RS", "Serbia");
            map.put("RU", "Russian Federation");
            map.put("RW", "Rwanda");
            map.put("SA", "Saudi Arabia");
            map.put("SB", "Solomon Islands");
            map.put("SC", "Seychelles");
            map.put("SD", "Sudan");
            map.put("SE", "Sweden");
            map.put("SG", "Singapore");
            map.put("SH", "Saint Helena");
            map.put("SI", "Slovenia");
            map.put("SJ", "Svalbard and Jan Mayen");
            map.put("SK", "Slovakia");
            map.put("SL", "Sierra Leone");
            map.put("SM", "San Marino");
            map.put("SN", "Senegal");
            map.put("SO", "Somalia");
            map.put("SR", "Suriname");
            map.put("SS", "South Sudan");
            map.put("ST", "Sao Tome and Principe");
            map.put("SV", "El Salvador");
            map.put("SX", "Sint Maarten");
            map.put("SY", "Syrian Arab Republic");
            map.put("SZ", "Swaziland");
            map.put("TC", "Turks and Caicos Islands");
            map.put("TD", "Chad");
            map.put("TF", "French Southern Territories");
            map.put("TG", "Togo");
            map.put("TH", "Thailand");
            map.put("TJ", "Tajikistan");
            map.put("TK", "Tokelau");
            map.put("TL", "Timor-Leste");
            map.put("TM", "Turkmenistan");
            map.put("TN", "Tunisia");
            map.put("TO", "Tonga");
            map.put("TR", "Turkey");
            map.put("TT", "Trinidad and Tobago");
            map.put("TV", "Tuvalu");
            map.put("TW", "Taiwan");
            map.put("TZ", "Tanzania, United Republic of");
            map.put("UA", "Ukraine");
            map.put("UG", "Uganda");
            map.put("UM", "United States Minor Outlying Islands");
            map.put("US", "United States");
            map.put("UY", "Uruguay");
            map.put("UZ", "Uzbekistan");
            map.put("VA", "Holy See (Vatican City State)");
            map.put("VC", "Saint Vincent and the Grenadines");
            map.put("VE", "Venezuela");
            map.put("VG", "Virgin Islands, British");
            map.put("VI", "Virgin Islands, U.S.");
            map.put("VN", "Vietnam");
            map.put("VU", "Vanuatu");
            map.put("WF", "Wallis and Futuna");
            map.put("WS", "Samoa");
            map.put("YE", "Yemen");
            map.put("YT", "Mayotte");
            map.put("ZA", "South Africa");
            map.put("ZM", "Zambia");
            map.put("ZW", "Zimbabwe");
        }
        return map;
    }

    public static void d(Map map) {
        try {
            if (map.containsKey("Country")) {
                String strG = g(map.get("Country").toString());
                if (strG != null) {
                    map.put("Country", strG);
                } else {
                    map.remove("Country");
                }
            }
            if (map.containsKey("City")) {
                map.put("City", f(map.get("City").toString()));
            }
        } catch (Exception e5) {
            h.n("Failed converting geoTags", e5);
        }
    }

    private static String e(String str) {
        if (str.length() == 0) {
            return "";
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    private static String f(String str) {
        return str.split(", ")[r1.length - 1];
    }

    private static String g(String str) {
        String upperCase = str.toUpperCase();
        Map mapC = c();
        if (mapC.containsKey(upperCase)) {
            return (String) mapC.get(upperCase);
        }
        return null;
    }

    private static String h(String str) {
        if (str.length() == 0) {
            return "$.00";
        }
        if (str.length() == 1) {
            str = "0" + str;
        }
        String strSubstring = str.substring(str.length() - 2, str.length());
        return "$" + str.substring(0, str.length() - 2) + "." + strSubstring;
    }

    private static String i(String str) {
        String str2 = "";
        if (str.length() == 0) {
            return "";
        }
        int length = str.length();
        while (length > 0) {
            length -= 3;
            str2 = str.substring(Math.max(length, 0), length + 3) + "," + str2;
        }
        return str2.substring(0, str2.length() - 1);
    }

    private static String j(String str) {
        Date date = new Date(Long.valueOf(Long.parseLong(str)).longValue() * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM-dd-yy");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT-0"));
        return simpleDateFormat.format(date);
    }

    private static String k(String str) {
        Date date = new Date(Long.valueOf(Long.parseLong(str)).longValue() * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yy");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT-0"));
        return simpleDateFormat.format(date);
    }

    private static String l(String str) {
        Date date = new Date(Long.valueOf(Long.parseLong(str)).longValue() * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd yy");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT-0"));
        return simpleDateFormat.format(date);
    }

    private static String m(String str) {
        Date date = new Date(Long.valueOf(Long.parseLong(str)).longValue() * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd yyyy");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT-0"));
        return simpleDateFormat.format(date);
    }

    private static String n(String str) {
        Date date = new Date(Long.valueOf(Long.parseLong(str)).longValue() * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT-0"));
        return simpleDateFormat.format(date);
    }

    private static String o(String str) {
        Date date = new Date(Long.valueOf(Long.parseLong(str)).longValue() * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT-0"));
        return simpleDateFormat.format(date);
    }

    private static String p(String str) {
        Date date = new Date(Long.valueOf(Long.parseLong(str)).longValue() * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT-0"));
        return simpleDateFormat.format(date);
    }

    private static String q(String str) {
        Date date = new Date(Long.valueOf(Long.parseLong(str)).longValue() * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yy hh:mm");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT-0"));
        return simpleDateFormat.format(date);
    }

    private static String r(String str) {
        if (str.length() == 0) {
            return "$0";
        }
        return "$" + i(str);
    }

    private static String s(String str) {
        if (str.length() == 0) {
            return "€0";
        }
        return "€" + i(str);
    }

    private static String t(String str) {
        if (str.length() == 0) {
            return "¥0";
        }
        return "¥" + i(str);
    }

    private static String u(String str) {
        if (str.length() == 0) {
            return "₤0";
        }
        return "₤" + i(str);
    }
}
