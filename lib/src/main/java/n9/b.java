package n9;

import android.os.Bundle;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private int f25619a;

    /* renamed from: b, reason: collision with root package name */
    private int f25620b;

    /* renamed from: c, reason: collision with root package name */
    private String f25621c;

    /* renamed from: d, reason: collision with root package name */
    private long f25622d;

    /* renamed from: e, reason: collision with root package name */
    private Bundle f25623e;

    public b(int i10, int i11, String str) {
        this.f25619a = i10;
        this.f25620b = i11;
        this.f25621c = str;
        this.f25623e = new Bundle();
    }

    public b(int i10, int i11, String str, long j10, Bundle bundle) {
        this.f25619a = i10;
        this.f25620b = i11;
        this.f25621c = str;
        this.f25622d = j10;
        this.f25623e = bundle;
    }

    public Bundle a() {
        return this.f25623e;
    }

    public int b() {
        return this.f25620b;
    }

    public String c() {
        return this.f25621c;
    }

    public int d() {
        return this.f25619a;
    }

    public long e() {
        return this.f25622d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f25619a != bVar.f25619a || this.f25620b != bVar.f25620b || this.f25622d != bVar.f25622d) {
            return false;
        }
        String str = this.f25621c;
        if (str == null ? bVar.f25621c != null : !str.equals(bVar.f25621c)) {
            return false;
        }
        Bundle bundle = this.f25623e;
        Bundle bundle2 = bVar.f25623e;
        return bundle != null ? bundle.equals(bundle2) : bundle2 == null;
    }

    public int hashCode() {
        int i10 = ((this.f25619a * 31) + this.f25620b) * 31;
        String str = this.f25621c;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j10 = this.f25622d;
        int i11 = (((i10 + iHashCode) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        Bundle bundle = this.f25623e;
        return i11 + (bundle != null ? bundle.hashCode() : 0);
    }
}
