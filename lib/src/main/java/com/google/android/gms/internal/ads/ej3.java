package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class ej3 {
    static xi3 a(cs3 cs3Var) {
        if (cs3Var.N() == 3) {
            return new ui3(16);
        }
        if (cs3Var.N() == 4) {
            return new ui3(32);
        }
        if (cs3Var.N() == 5) {
            return new vi3();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    static bj3 b(cs3 cs3Var) {
        if (cs3Var.P() == 3) {
            return new nj3(new wi3("HmacSha256"));
        }
        if (cs3Var.P() == 4) {
            return lj3.c(1);
        }
        if (cs3Var.P() == 5) {
            return lj3.c(2);
        }
        if (cs3Var.P() == 6) {
            return lj3.c(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    static wi3 c(cs3 cs3Var) {
        if (cs3Var.O() == 3) {
            return new wi3("HmacSha256");
        }
        if (cs3Var.O() == 4) {
            return new wi3("HmacSha384");
        }
        if (cs3Var.O() == 5) {
            return new wi3("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
