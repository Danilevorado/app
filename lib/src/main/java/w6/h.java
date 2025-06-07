package w6;

/* loaded from: classes.dex */
public enum h {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* renamed from: m, reason: collision with root package name */
    private final int[] f27983m;

    /* renamed from: n, reason: collision with root package name */
    private final int f27984n;

    h(int[] iArr, int i10) {
        this.f27983m = iArr;
        this.f27984n = i10;
    }

    public static h b(int i10) {
        if (i10 == 0) {
            return TERMINATOR;
        }
        if (i10 == 1) {
            return NUMERIC;
        }
        if (i10 == 2) {
            return ALPHANUMERIC;
        }
        if (i10 == 3) {
            return STRUCTURED_APPEND;
        }
        if (i10 == 4) {
            return BYTE;
        }
        if (i10 == 5) {
            return FNC1_FIRST_POSITION;
        }
        if (i10 == 7) {
            return ECI;
        }
        if (i10 == 8) {
            return KANJI;
        }
        if (i10 == 9) {
            return FNC1_SECOND_POSITION;
        }
        if (i10 == 13) {
            return HANZI;
        }
        throw new IllegalArgumentException();
    }

    public int d(j jVar) {
        int iJ = jVar.j();
        return this.f27983m[iJ <= 9 ? (char) 0 : iJ <= 26 ? (char) 1 : (char) 2];
    }
}
