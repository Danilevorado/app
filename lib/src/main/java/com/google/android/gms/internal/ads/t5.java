package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class t5 {

    /* renamed from: a, reason: collision with root package name */
    static final String[] f15692a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15693b = 0;

    public static kc0 a(jm2 jm2Var) {
        String str;
        String str2;
        int iK = jm2Var.k() + jm2Var.m();
        int iM = jm2Var.m();
        int i10 = (iM >> 24) & 255;
        kc0 b3Var = null;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = iM & 16777215;
                if (i11 == 6516084) {
                    int iM2 = jm2Var.m();
                    if (jm2Var.m() == 1684108385) {
                        jm2Var.g(8);
                        String strE = jm2Var.E(iM2 - 16);
                        b3Var = new b3("und", strE, strE);
                    } else {
                        ad2.e("MetadataUtil", "Failed to parse comment attribute: ".concat(d5.b(iM)));
                    }
                    return b3Var;
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    return e(iM, "TIT2", jm2Var);
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    return e(iM, "TCOM", jm2Var);
                }
                if (i11 == 6578553) {
                    return e(iM, "TDRC", jm2Var);
                }
                if (i11 == 4280916) {
                    return e(iM, "TPE1", jm2Var);
                }
                if (i11 == 7630703) {
                    return e(iM, "TSSE", jm2Var);
                }
                if (i11 == 6384738) {
                    return e(iM, "TALB", jm2Var);
                }
                if (i11 == 7108978) {
                    return e(iM, "USLT", jm2Var);
                }
                if (i11 == 6776174) {
                    return e(iM, "TCON", jm2Var);
                }
                if (i11 == 6779504) {
                    return e(iM, "TIT1", jm2Var);
                }
            } else {
                if (iM == 1735291493) {
                    int iB = b(jm2Var);
                    String str3 = (iB <= 0 || iB > 192) ? null : f15692a[iB - 1];
                    if (str3 != null) {
                        b3Var = new r3("TCON", null, c63.v(str3));
                    } else {
                        ad2.e("MetadataUtil", "Failed to parse standard genre code");
                    }
                    return b3Var;
                }
                if (iM == 1684632427) {
                    return d(1684632427, "TPOS", jm2Var);
                }
                if (iM == 1953655662) {
                    return d(1953655662, "TRCK", jm2Var);
                }
                if (iM == 1953329263) {
                    return c(1953329263, "TBPM", jm2Var, true, false);
                }
                if (iM == 1668311404) {
                    return c(1668311404, "TCMP", jm2Var, true, true);
                }
                if (iM == 1668249202) {
                    int iM3 = jm2Var.m();
                    if (jm2Var.m() == 1684108385) {
                        int iM4 = jm2Var.m() & 16777215;
                        if (iM4 == 13) {
                            str2 = "image/jpeg";
                        } else if (iM4 == 14) {
                            str2 = "image/png";
                            iM4 = 14;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            jm2Var.g(4);
                            int i12 = iM3 - 16;
                            byte[] bArr = new byte[i12];
                            jm2Var.b(bArr, 0, i12);
                            b3Var = new t2(str2, null, 3, bArr);
                            return b3Var;
                        }
                        str = "Unrecognized cover art flags: " + iM4;
                    } else {
                        str = "Failed to parse cover art attribute";
                    }
                    ad2.e("MetadataUtil", str);
                    return b3Var;
                }
                if (iM == 1631670868) {
                    return e(1631670868, "TPE2", jm2Var);
                }
                if (iM == 1936682605) {
                    return e(1936682605, "TSOT", jm2Var);
                }
                if (iM == 1936679276) {
                    return e(1936679276, "TSO2", jm2Var);
                }
                if (iM == 1936679282) {
                    return e(1936679282, "TSOA", jm2Var);
                }
                if (iM == 1936679265) {
                    return e(1936679265, "TSOP", jm2Var);
                }
                if (iM == 1936679791) {
                    return e(1936679791, "TSOC", jm2Var);
                }
                if (iM == 1920233063) {
                    return c(1920233063, "ITUNESADVISORY", jm2Var, false, false);
                }
                if (iM == 1885823344) {
                    return c(1885823344, "ITUNESGAPLESS", jm2Var, false, true);
                }
                if (iM == 1936683886) {
                    return e(1936683886, "TVSHOWSORT", jm2Var);
                }
                if (iM == 1953919848) {
                    return e(1953919848, "TVSHOW", jm2Var);
                }
                if (iM == 757935405) {
                    String strE2 = null;
                    String strE3 = null;
                    int i13 = -1;
                    int i14 = -1;
                    while (jm2Var.k() < iK) {
                        int iK2 = jm2Var.k();
                        int iM5 = jm2Var.m();
                        int iM6 = jm2Var.m();
                        jm2Var.g(4);
                        if (iM6 == 1835360622) {
                            strE2 = jm2Var.E(iM5 - 12);
                        } else if (iM6 == 1851878757) {
                            strE3 = jm2Var.E(iM5 - 12);
                        } else {
                            if (iM6 == 1684108385) {
                                i14 = iM5;
                            }
                            if (iM6 == 1684108385) {
                                i13 = iK2;
                            }
                            jm2Var.g(iM5 - 12);
                        }
                    }
                    if (strE2 != null && strE3 != null && i13 != -1) {
                        jm2Var.f(i13);
                        jm2Var.g(16);
                        b3Var = new l3(strE2, strE3, jm2Var.E(i14 - 16));
                    }
                    return b3Var;
                }
            }
            ad2.a("MetadataUtil", "Skipped unknown metadata entry: " + d5.b(iM));
            return null;
        } finally {
            jm2Var.f(iK);
        }
    }

    private static int b(jm2 jm2Var) {
        jm2Var.g(4);
        if (jm2Var.m() == 1684108385) {
            jm2Var.g(8);
            return jm2Var.s();
        }
        ad2.e("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static j3 c(int i10, String str, jm2 jm2Var, boolean z10, boolean z11) {
        int iB = b(jm2Var);
        if (z11) {
            iB = Math.min(1, iB);
        }
        if (iB >= 0) {
            return z10 ? new r3(str, null, c63.v(Integer.toString(iB))) : new b3("und", str, Integer.toString(iB));
        }
        ad2.e("MetadataUtil", "Failed to parse uint8 attribute: ".concat(d5.b(i10)));
        return null;
    }

    private static r3 d(int i10, String str, jm2 jm2Var) {
        int iM = jm2Var.m();
        if (jm2Var.m() == 1684108385 && iM >= 22) {
            jm2Var.g(10);
            int iW = jm2Var.w();
            if (iW > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(iW);
                String string = sb2.toString();
                int iW2 = jm2Var.w();
                if (iW2 > 0) {
                    string = string + "/" + iW2;
                }
                return new r3(str, null, c63.v(string));
            }
        }
        ad2.e("MetadataUtil", "Failed to parse index/count attribute: ".concat(d5.b(i10)));
        return null;
    }

    private static r3 e(int i10, String str, jm2 jm2Var) {
        int iM = jm2Var.m();
        if (jm2Var.m() == 1684108385) {
            jm2Var.g(8);
            return new r3(str, null, c63.v(jm2Var.E(iM - 16)));
        }
        ad2.e("MetadataUtil", "Failed to parse text attribute: ".concat(d5.b(i10)));
        return null;
    }
}
