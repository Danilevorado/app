package a7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0002a();
    private final String A;
    private final String[] B;
    private final ArrayList C;
    private Matcher[] D;
    private final boolean E;
    private final boolean F;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f188m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f189n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f190o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f191p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f192q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f193r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f194s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f195t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f196u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f197v;

    /* renamed from: w, reason: collision with root package name */
    private final int f198w;

    /* renamed from: x, reason: collision with root package name */
    private final int f199x;

    /* renamed from: y, reason: collision with root package name */
    private final int f200y;

    /* renamed from: z, reason: collision with root package name */
    private final int f201z;

    /* renamed from: a7.a$a, reason: collision with other inner class name */
    static class C0002a implements Parcelable.Creator {
        C0002a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static class b {

        /* renamed from: o, reason: collision with root package name */
        private String f216o;

        /* renamed from: a, reason: collision with root package name */
        private boolean f202a = false;

        /* renamed from: b, reason: collision with root package name */
        private boolean f203b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f204c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f205d = true;

        /* renamed from: e, reason: collision with root package name */
        private boolean f206e = true;

        /* renamed from: f, reason: collision with root package name */
        private boolean f207f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f208g = false;

        /* renamed from: h, reason: collision with root package name */
        private boolean f209h = true;

        /* renamed from: i, reason: collision with root package name */
        private boolean f210i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f211j = true;

        /* renamed from: k, reason: collision with root package name */
        private int f212k = -1;

        /* renamed from: l, reason: collision with root package name */
        private int f213l = -1;

        /* renamed from: m, reason: collision with root package name */
        private int f214m = 5;

        /* renamed from: n, reason: collision with root package name */
        private int f215n = 3;

        /* renamed from: p, reason: collision with root package name */
        private String[] f217p = {"txt", "pdf", "html", "rtf", "csv", "xml", "zip", "tar", "gz", "rar", "7z", "torrent", "doc", "docx", "odt", "ott", "ppt", "pptx", "pps", "xls", "xlsx", "ods", "ots"};

        /* renamed from: q, reason: collision with root package name */
        private ArrayList f218q = null;

        /* renamed from: r, reason: collision with root package name */
        private String[] f219r = null;

        /* renamed from: s, reason: collision with root package name */
        private boolean f220s = true;

        /* renamed from: t, reason: collision with root package name */
        private boolean f221t = true;

        public a u() {
            return new a(this, null);
        }
    }

    private a(b bVar) {
        this.f188m = bVar.f202a;
        this.f189n = bVar.f203b;
        this.f190o = bVar.f206e;
        this.f191p = bVar.f205d;
        this.f192q = bVar.f208g;
        this.f193r = bVar.f207f;
        this.f194s = bVar.f209h;
        this.f195t = bVar.f210i;
        this.f196u = bVar.f204c;
        this.f197v = bVar.f211j;
        this.f198w = bVar.f212k;
        this.f199x = bVar.f213l;
        this.f200y = bVar.f214m;
        this.f201z = bVar.f215n;
        this.A = bVar.f216o;
        this.B = bVar.f217p;
        this.C = bVar.f218q;
        F(bVar.f219r);
        this.E = bVar.f220s;
        this.F = bVar.f221t;
    }

    /* synthetic */ a(b bVar, C0002a c0002a) {
        this(bVar);
    }

    protected a(Parcel parcel) {
        this.f188m = parcel.readByte() != 0;
        this.f189n = parcel.readByte() != 0;
        this.f190o = parcel.readByte() != 0;
        this.f191p = parcel.readByte() != 0;
        this.f192q = parcel.readByte() != 0;
        this.f193r = parcel.readByte() != 0;
        this.f194s = parcel.readByte() != 0;
        this.f195t = parcel.readByte() != 0;
        this.f196u = parcel.readByte() != 0;
        this.f197v = parcel.readByte() != 0;
        this.f198w = parcel.readInt();
        this.f199x = parcel.readInt();
        this.f200y = parcel.readInt();
        this.f201z = parcel.readInt();
        this.A = parcel.readString();
        this.B = parcel.createStringArray();
        this.C = parcel.createTypedArrayList(c7.a.CREATOR);
        F(parcel.createStringArray());
        this.E = parcel.readByte() != 0;
        this.F = parcel.readByte() != 0;
    }

    private void F(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        this.D = new Matcher[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            this.D[i10] = Pattern.compile(strArr[i10]).matcher("");
        }
    }

    private String[] b() {
        Matcher[] matcherArr = this.D;
        if (matcherArr == null || matcherArr.length <= 0) {
            return null;
        }
        int length = matcherArr.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = this.D[i10].pattern().pattern();
        }
        return strArr;
    }

    public boolean A() {
        return this.f190o;
    }

    public boolean B() {
        return this.f195t;
    }

    public boolean C() {
        return this.f194s;
    }

    public boolean D() {
        return this.f197v;
    }

    public boolean E() {
        return this.f189n;
    }

    public Matcher[] a() {
        return this.D;
    }

    public int c() {
        return this.f198w;
    }

    public int d() {
        return this.f200y;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f199x;
    }

    public int f() {
        return this.f201z;
    }

    public String g() {
        return this.A;
    }

    public ArrayList h() {
        return this.C;
    }

    public String[] j() {
        return this.B;
    }

    public boolean m() {
        return this.f196u;
    }

    public boolean r() {
        return this.F;
    }

    public boolean v() {
        return this.E;
    }

    public boolean w() {
        return this.f188m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f188m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f189n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f190o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f191p ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f192q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f193r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f194s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f195t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f196u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f197v ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f198w);
        parcel.writeInt(this.f199x);
        parcel.writeInt(this.f200y);
        parcel.writeInt(this.f201z);
        parcel.writeString(this.A);
        parcel.writeStringArray(this.B);
        parcel.writeTypedList(this.C);
        parcel.writeStringArray(b());
        parcel.writeByte(this.E ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.F ? (byte) 1 : (byte) 0);
    }

    public boolean x() {
        return this.f192q;
    }

    public boolean y() {
        return this.f193r;
    }

    public boolean z() {
        return this.f191p;
    }
}
