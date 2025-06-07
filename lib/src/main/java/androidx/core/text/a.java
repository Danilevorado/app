package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    static final d f2323d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f2324e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f2325f;

    /* renamed from: g, reason: collision with root package name */
    static final a f2326g;

    /* renamed from: h, reason: collision with root package name */
    static final a f2327h;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2328a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2329b;

    /* renamed from: c, reason: collision with root package name */
    private final d f2330c;

    /* renamed from: androidx.core.text.a$a, reason: collision with other inner class name */
    public static final class C0029a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f2331a;

        /* renamed from: b, reason: collision with root package name */
        private int f2332b;

        /* renamed from: c, reason: collision with root package name */
        private d f2333c;

        public C0029a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z10) {
            return z10 ? a.f2327h : a.f2326g;
        }

        private void c(boolean z10) {
            this.f2331a = z10;
            this.f2333c = a.f2323d;
            this.f2332b = 2;
        }

        public a a() {
            return (this.f2332b == 2 && this.f2333c == a.f2323d) ? b(this.f2331a) : new a(this.f2331a, this.f2332b, this.f2333c);
        }
    }

    private static class b {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f2334f = new byte[1792];

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f2335a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f2336b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2337c;

        /* renamed from: d, reason: collision with root package name */
        private int f2338d;

        /* renamed from: e, reason: collision with root package name */
        private char f2339e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f2334f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f2335a = charSequence;
            this.f2336b = z10;
            this.f2337c = charSequence.length();
        }

        private static byte c(char c10) {
            return c10 < 1792 ? f2334f[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char cCharAt;
            int i10 = this.f2338d;
            do {
                int i11 = this.f2338d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2335a;
                int i12 = i11 - 1;
                this.f2338d = i12;
                cCharAt = charSequence.charAt(i12);
                this.f2339e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f2338d = i10;
            this.f2339e = ';';
            return (byte) 13;
        }

        private byte g() {
            char cCharAt;
            do {
                int i10 = this.f2338d;
                if (i10 >= this.f2337c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f2335a;
                this.f2338d = i10 + 1;
                cCharAt = charSequence.charAt(i10);
                this.f2339e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char cCharAt;
            int i10 = this.f2338d;
            while (true) {
                int i11 = this.f2338d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2335a;
                int i12 = i11 - 1;
                this.f2338d = i12;
                char cCharAt2 = charSequence.charAt(i12);
                this.f2339e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.f2338d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f2335a;
                            int i14 = i13 - 1;
                            this.f2338d = i14;
                            cCharAt = charSequence2.charAt(i14);
                            this.f2339e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f2338d = i10;
            this.f2339e = '>';
            return (byte) 13;
        }

        private byte i() {
            char cCharAt;
            int i10 = this.f2338d;
            while (true) {
                int i11 = this.f2338d;
                if (i11 >= this.f2337c) {
                    this.f2338d = i10;
                    this.f2339e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f2335a;
                this.f2338d = i11 + 1;
                char cCharAt2 = charSequence.charAt(i11);
                this.f2339e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i12 = this.f2338d;
                        if (i12 < this.f2337c) {
                            CharSequence charSequence2 = this.f2335a;
                            this.f2338d = i12 + 1;
                            cCharAt = charSequence2.charAt(i12);
                            this.f2339e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f2335a.charAt(this.f2338d - 1);
            this.f2339e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f2335a, this.f2338d);
                this.f2338d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f2338d--;
            byte bC = c(this.f2339e);
            if (!this.f2336b) {
                return bC;
            }
            char c10 = this.f2339e;
            return c10 == '>' ? h() : c10 == ';' ? f() : bC;
        }

        byte b() {
            char cCharAt = this.f2335a.charAt(this.f2338d);
            this.f2339e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f2335a, this.f2338d);
                this.f2338d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f2338d++;
            byte bC = c(this.f2339e);
            if (!this.f2336b) {
                return bC;
            }
            char c10 = this.f2339e;
            return c10 == '<' ? i() : c10 == '&' ? g() : bC;
        }

        int d() {
            this.f2338d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f2338d < this.f2337c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f2338d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        int e() {
            this.f2338d = this.f2337c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f2338d > 0) {
                    byte bA = a();
                    if (bA != 0) {
                        if (bA == 1 || bA == 2) {
                            if (i10 == 0) {
                                return 1;
                            }
                            if (i11 == 0) {
                                break;
                            }
                        } else if (bA != 9) {
                            switch (bA) {
                                case 14:
                                case 15:
                                    if (i11 == i10) {
                                        return -1;
                                    }
                                    i10--;
                                    break;
                                case 16:
                                case 17:
                                    if (i11 == i10) {
                                        return 1;
                                    }
                                    i10--;
                                    break;
                                case 18:
                                    i10++;
                                    break;
                                default:
                                    if (i11 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i10 == 0) {
                            return -1;
                        }
                        if (i11 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        d dVar = e.f2352c;
        f2323d = dVar;
        f2324e = Character.toString((char) 8206);
        f2325f = Character.toString((char) 8207);
        f2326g = new a(false, 2, dVar);
        f2327h = new a(true, 2, dVar);
    }

    a(boolean z10, int i10, d dVar) {
        this.f2328a = z10;
        this.f2329b = i10;
        this.f2330c = dVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0029a().a();
    }

    static boolean e(Locale locale) {
        return f.a(locale) == 1;
    }

    private String f(CharSequence charSequence, d dVar) {
        boolean zA = dVar.a(charSequence, 0, charSequence.length());
        return (this.f2328a || !(zA || b(charSequence) == 1)) ? this.f2328a ? (!zA || b(charSequence) == -1) ? f2325f : "" : "" : f2324e;
    }

    private String g(CharSequence charSequence, d dVar) {
        boolean zA = dVar.a(charSequence, 0, charSequence.length());
        return (this.f2328a || !(zA || a(charSequence) == 1)) ? this.f2328a ? (!zA || a(charSequence) == -1) ? f2325f : "" : "" : f2324e;
    }

    public boolean d() {
        return (this.f2329b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f2330c, true);
    }

    public CharSequence i(CharSequence charSequence, d dVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean zA = dVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zA ? e.f2351b : e.f2350a));
        }
        if (zA != this.f2328a) {
            spannableStringBuilder.append(zA ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zA ? e.f2351b : e.f2350a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f2330c, true);
    }

    public String k(String str, d dVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, dVar, z10).toString();
    }
}
