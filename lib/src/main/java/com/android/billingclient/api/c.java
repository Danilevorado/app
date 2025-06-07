package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private boolean f5165a;

    /* renamed from: b, reason: collision with root package name */
    private String f5166b;

    /* renamed from: c, reason: collision with root package name */
    private String f5167c;

    /* renamed from: d, reason: collision with root package name */
    private b f5168d;

    /* renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.play_billing.j f5169e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f5170f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5171g;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f5172a;

        /* renamed from: b, reason: collision with root package name */
        private String f5173b;

        /* renamed from: c, reason: collision with root package name */
        private List f5174c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList f5175d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f5176e;

        /* renamed from: f, reason: collision with root package name */
        private b.a f5177f;

        /* synthetic */ a(k1.m mVar) {
            b.a aVarA = b.a();
            b.a.b(aVarA);
            this.f5177f = aVarA;
        }

        public c a() {
            ArrayList arrayList = this.f5175d;
            boolean z10 = true;
            boolean z11 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f5174c;
            boolean z12 = (list == null || list.isEmpty()) ? false : true;
            if (!z11 && !z12) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z11 && z12) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            k1.q qVar = null;
            if (!z11) {
                a5.a.a(this.f5174c.get(0));
                if (this.f5174c.size() <= 0) {
                    throw null;
                }
                a5.a.a(this.f5174c.get(0));
                throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
            }
            if (this.f5175d.contains(null)) {
                throw new IllegalArgumentException("SKU cannot be null.");
            }
            if (this.f5175d.size() > 1) {
                SkuDetails skuDetails = (SkuDetails) this.f5175d.get(0);
                String strB = skuDetails.b();
                ArrayList arrayList2 = this.f5175d;
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i10);
                    if (!strB.equals("play_pass_subs") && !skuDetails2.b().equals("play_pass_subs") && !strB.equals(skuDetails2.b())) {
                        throw new IllegalArgumentException("SKUs should have the same type.");
                    }
                }
                String strF = skuDetails.f();
                ArrayList arrayList3 = this.f5175d;
                int size2 = arrayList3.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i11);
                    if (!strB.equals("play_pass_subs") && !skuDetails3.b().equals("play_pass_subs") && !strF.equals(skuDetails3.f())) {
                        throw new IllegalArgumentException("All SKUs must have the same package name.");
                    }
                }
            }
            c cVar = new c(qVar);
            if (!z11 || ((SkuDetails) this.f5175d.get(0)).f().isEmpty()) {
                if (z12) {
                    a5.a.a(this.f5174c.get(0));
                    throw null;
                }
                z10 = false;
            }
            cVar.f5165a = z10;
            cVar.f5166b = this.f5172a;
            cVar.f5167c = this.f5173b;
            cVar.f5168d = this.f5177f.a();
            ArrayList arrayList4 = this.f5175d;
            cVar.f5170f = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
            cVar.f5171g = this.f5176e;
            List list2 = this.f5174c;
            cVar.f5169e = list2 != null ? com.google.android.gms.internal.play_billing.j.q(list2) : com.google.android.gms.internal.play_billing.j.s();
            return cVar;
        }

        public a b(SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.f5175d = arrayList;
            return this;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f5178a;

        /* renamed from: b, reason: collision with root package name */
        private String f5179b;

        /* renamed from: c, reason: collision with root package name */
        private int f5180c = 0;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private String f5181a;

            /* renamed from: b, reason: collision with root package name */
            private String f5182b;

            /* renamed from: c, reason: collision with root package name */
            private boolean f5183c;

            /* renamed from: d, reason: collision with root package name */
            private int f5184d = 0;

            /* synthetic */ a(k1.n nVar) {
            }

            static /* synthetic */ a b(a aVar) {
                aVar.f5183c = true;
                return aVar;
            }

            public b a() {
                k1.o oVar = null;
                boolean z10 = (TextUtils.isEmpty(this.f5181a) && TextUtils.isEmpty(null)) ? false : true;
                boolean zIsEmpty = true ^ TextUtils.isEmpty(this.f5182b);
                if (z10 && zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f5183c && !z10 && !zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                b bVar = new b(oVar);
                bVar.f5178a = this.f5181a;
                bVar.f5180c = this.f5184d;
                bVar.f5179b = this.f5182b;
                return bVar;
            }
        }

        /* synthetic */ b(k1.o oVar) {
        }

        public static a a() {
            return new a(null);
        }

        final int b() {
            return this.f5180c;
        }

        final String c() {
            return this.f5178a;
        }

        final String d() {
            return this.f5179b;
        }
    }

    /* synthetic */ c(k1.q qVar) {
    }

    public static a a() {
        return new a(null);
    }

    public final int b() {
        return this.f5168d.b();
    }

    public final String c() {
        return this.f5166b;
    }

    public final String d() {
        return this.f5167c;
    }

    public final String e() {
        return this.f5168d.c();
    }

    public final String f() {
        return this.f5168d.d();
    }

    public final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f5170f);
        return arrayList;
    }

    public final List h() {
        return this.f5169e;
    }

    public final boolean p() {
        return this.f5171g;
    }

    final boolean q() {
        return (this.f5166b == null && this.f5167c == null && this.f5168d.d() == null && this.f5168d.b() == 0 && !this.f5165a && !this.f5171g) ? false : true;
    }
}
