package u0;

/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: m, reason: collision with root package name */
    private final String f27525m;

    /* renamed from: n, reason: collision with root package name */
    private final Object[] f27526n;

    public a(String str) {
        this(str, null);
    }

    public a(String str, Object[] objArr) {
        this.f27525m = str;
        this.f27526n = objArr;
    }

    private static void b(i iVar, int i10, Object obj) {
        long jLongValue;
        int iByteValue;
        double dDoubleValue;
        if (obj == null) {
            iVar.v(i10);
            return;
        }
        if (obj instanceof byte[]) {
            iVar.L(i10, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            dDoubleValue = ((Float) obj).floatValue();
        } else {
            if (!(obj instanceof Double)) {
                if (obj instanceof Long) {
                    jLongValue = ((Long) obj).longValue();
                } else {
                    if (obj instanceof Integer) {
                        iByteValue = ((Integer) obj).intValue();
                    } else if (obj instanceof Short) {
                        iByteValue = ((Short) obj).shortValue();
                    } else if (obj instanceof Byte) {
                        iByteValue = ((Byte) obj).byteValue();
                    } else {
                        if (obj instanceof String) {
                            iVar.q(i10, (String) obj);
                            return;
                        }
                        if (!(obj instanceof Boolean)) {
                            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                        }
                        jLongValue = ((Boolean) obj).booleanValue() ? 1L : 0L;
                    }
                    jLongValue = iByteValue;
                }
                iVar.G(i10, jLongValue);
                return;
            }
            dDoubleValue = ((Double) obj).doubleValue();
        }
        iVar.w(i10, dDoubleValue);
    }

    public static void d(i iVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            i10++;
            b(iVar, i10, obj);
        }
    }

    @Override // u0.j
    public String a() {
        return this.f27525m;
    }

    @Override // u0.j
    public void c(i iVar) {
        d(iVar, this.f27526n);
    }
}
