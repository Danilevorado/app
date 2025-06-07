package androidx.media;

import java.util.Arrays;

/* loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    int f3194a = 0;

    /* renamed from: b, reason: collision with root package name */
    int f3195b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f3196c = 0;

    /* renamed from: d, reason: collision with root package name */
    int f3197d = -1;

    AudioAttributesImplBase() {
    }

    public int a() {
        return this.f3195b;
    }

    public int b() {
        int i10 = this.f3196c;
        int iC = c();
        if (iC == 6) {
            i10 |= 4;
        } else if (iC == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int c() {
        int i10 = this.f3197d;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(false, this.f3196c, this.f3194a);
    }

    public int d() {
        return this.f3194a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f3195b == audioAttributesImplBase.a() && this.f3196c == audioAttributesImplBase.b() && this.f3194a == audioAttributesImplBase.d() && this.f3197d == audioAttributesImplBase.f3197d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3195b), Integer.valueOf(this.f3196c), Integer.valueOf(this.f3194a), Integer.valueOf(this.f3197d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f3197d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f3197d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.b(this.f3194a));
        sb2.append(" content=");
        sb2.append(this.f3195b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f3196c).toUpperCase());
        return sb2.toString();
    }
}
