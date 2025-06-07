package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.v;
import androidx.lifecycle.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: m, reason: collision with root package name */
    final int[] f2728m;

    /* renamed from: n, reason: collision with root package name */
    final ArrayList f2729n;

    /* renamed from: o, reason: collision with root package name */
    final int[] f2730o;

    /* renamed from: p, reason: collision with root package name */
    final int[] f2731p;

    /* renamed from: q, reason: collision with root package name */
    final int f2732q;

    /* renamed from: r, reason: collision with root package name */
    final String f2733r;

    /* renamed from: s, reason: collision with root package name */
    final int f2734s;

    /* renamed from: t, reason: collision with root package name */
    final int f2735t;

    /* renamed from: u, reason: collision with root package name */
    final CharSequence f2736u;

    /* renamed from: v, reason: collision with root package name */
    final int f2737v;

    /* renamed from: w, reason: collision with root package name */
    final CharSequence f2738w;

    /* renamed from: x, reason: collision with root package name */
    final ArrayList f2739x;

    /* renamed from: y, reason: collision with root package name */
    final ArrayList f2740y;

    /* renamed from: z, reason: collision with root package name */
    final boolean f2741z;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(Parcel parcel) {
        this.f2728m = parcel.createIntArray();
        this.f2729n = parcel.createStringArrayList();
        this.f2730o = parcel.createIntArray();
        this.f2731p = parcel.createIntArray();
        this.f2732q = parcel.readInt();
        this.f2733r = parcel.readString();
        this.f2734s = parcel.readInt();
        this.f2735t = parcel.readInt();
        this.f2736u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2737v = parcel.readInt();
        this.f2738w = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2739x = parcel.createStringArrayList();
        this.f2740y = parcel.createStringArrayList();
        this.f2741z = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f2958c.size();
        this.f2728m = new int[size * 5];
        if (!aVar.f2964i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2729n = new ArrayList(size);
        this.f2730o = new int[size];
        this.f2731p = new int[size];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            v.a aVar2 = (v.a) aVar.f2958c.get(i10);
            int i12 = i11 + 1;
            this.f2728m[i11] = aVar2.f2975a;
            ArrayList arrayList = this.f2729n;
            Fragment fragment = aVar2.f2976b;
            arrayList.add(fragment != null ? fragment.f2677r : null);
            int[] iArr = this.f2728m;
            int i13 = i12 + 1;
            iArr[i12] = aVar2.f2977c;
            int i14 = i13 + 1;
            iArr[i13] = aVar2.f2978d;
            int i15 = i14 + 1;
            iArr[i14] = aVar2.f2979e;
            iArr[i15] = aVar2.f2980f;
            this.f2730o[i10] = aVar2.f2981g.ordinal();
            this.f2731p[i10] = aVar2.f2982h.ordinal();
            i10++;
            i11 = i15 + 1;
        }
        this.f2732q = aVar.f2963h;
        this.f2733r = aVar.f2966k;
        this.f2734s = aVar.f2725v;
        this.f2735t = aVar.f2967l;
        this.f2736u = aVar.f2968m;
        this.f2737v = aVar.f2969n;
        this.f2738w = aVar.f2970o;
        this.f2739x = aVar.f2971p;
        this.f2740y = aVar.f2972q;
        this.f2741z = aVar.f2973r;
    }

    public androidx.fragment.app.a a(m mVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(mVar);
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.f2728m.length) {
            v.a aVar2 = new v.a();
            int i12 = i10 + 1;
            aVar2.f2975a = this.f2728m[i10];
            if (m.F0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f2728m[i12]);
            }
            String str = (String) this.f2729n.get(i11);
            aVar2.f2976b = str != null ? mVar.g0(str) : null;
            aVar2.f2981g = j.c.values()[this.f2730o[i11]];
            aVar2.f2982h = j.c.values()[this.f2731p[i11]];
            int[] iArr = this.f2728m;
            int i13 = i12 + 1;
            int i14 = iArr[i12];
            aVar2.f2977c = i14;
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            aVar2.f2978d = i16;
            int i17 = i15 + 1;
            int i18 = iArr[i15];
            aVar2.f2979e = i18;
            int i19 = iArr[i17];
            aVar2.f2980f = i19;
            aVar.f2959d = i14;
            aVar.f2960e = i16;
            aVar.f2961f = i18;
            aVar.f2962g = i19;
            aVar.e(aVar2);
            i11++;
            i10 = i17 + 1;
        }
        aVar.f2963h = this.f2732q;
        aVar.f2966k = this.f2733r;
        aVar.f2725v = this.f2734s;
        aVar.f2964i = true;
        aVar.f2967l = this.f2735t;
        aVar.f2968m = this.f2736u;
        aVar.f2969n = this.f2737v;
        aVar.f2970o = this.f2738w;
        aVar.f2971p = this.f2739x;
        aVar.f2972q = this.f2740y;
        aVar.f2973r = this.f2741z;
        aVar.p(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f2728m);
        parcel.writeStringList(this.f2729n);
        parcel.writeIntArray(this.f2730o);
        parcel.writeIntArray(this.f2731p);
        parcel.writeInt(this.f2732q);
        parcel.writeString(this.f2733r);
        parcel.writeInt(this.f2734s);
        parcel.writeInt(this.f2735t);
        TextUtils.writeToParcel(this.f2736u, parcel, 0);
        parcel.writeInt(this.f2737v);
        TextUtils.writeToParcel(this.f2738w, parcel, 0);
        parcel.writeStringList(this.f2739x);
        parcel.writeStringList(this.f2740y);
        parcel.writeInt(this.f2741z ? 1 : 0);
    }
}
