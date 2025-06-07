package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class d {

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f1652f = {0, 4, 8};

    /* renamed from: g, reason: collision with root package name */
    private static SparseIntArray f1653g = new SparseIntArray();

    /* renamed from: h, reason: collision with root package name */
    private static SparseIntArray f1654h = new SparseIntArray();

    /* renamed from: a, reason: collision with root package name */
    public String f1655a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f1656b = 0;

    /* renamed from: c, reason: collision with root package name */
    private HashMap f1657c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private boolean f1658d = true;

    /* renamed from: e, reason: collision with root package name */
    private HashMap f1659e = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f1660a;

        /* renamed from: b, reason: collision with root package name */
        String f1661b;

        /* renamed from: c, reason: collision with root package name */
        public final C0017d f1662c = new C0017d();

        /* renamed from: d, reason: collision with root package name */
        public final c f1663d = new c();

        /* renamed from: e, reason: collision with root package name */
        public final b f1664e = new b();

        /* renamed from: f, reason: collision with root package name */
        public final e f1665f = new e();

        /* renamed from: g, reason: collision with root package name */
        public HashMap f1666g = new HashMap();

        /* renamed from: h, reason: collision with root package name */
        C0016a f1667h;

        /* renamed from: androidx.constraintlayout.widget.d$a$a, reason: collision with other inner class name */
        static class C0016a {

            /* renamed from: a, reason: collision with root package name */
            int[] f1668a = new int[10];

            /* renamed from: b, reason: collision with root package name */
            int[] f1669b = new int[10];

            /* renamed from: c, reason: collision with root package name */
            int f1670c = 0;

            /* renamed from: d, reason: collision with root package name */
            int[] f1671d = new int[10];

            /* renamed from: e, reason: collision with root package name */
            float[] f1672e = new float[10];

            /* renamed from: f, reason: collision with root package name */
            int f1673f = 0;

            /* renamed from: g, reason: collision with root package name */
            int[] f1674g = new int[5];

            /* renamed from: h, reason: collision with root package name */
            String[] f1675h = new String[5];

            /* renamed from: i, reason: collision with root package name */
            int f1676i = 0;

            /* renamed from: j, reason: collision with root package name */
            int[] f1677j = new int[4];

            /* renamed from: k, reason: collision with root package name */
            boolean[] f1678k = new boolean[4];

            /* renamed from: l, reason: collision with root package name */
            int f1679l = 0;

            C0016a() {
            }

            void a(int i10, float f5) {
                int i11 = this.f1673f;
                int[] iArr = this.f1671d;
                if (i11 >= iArr.length) {
                    this.f1671d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1672e;
                    this.f1672e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1671d;
                int i12 = this.f1673f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f1672e;
                this.f1673f = i12 + 1;
                fArr2[i12] = f5;
            }

            void b(int i10, int i11) {
                int i12 = this.f1670c;
                int[] iArr = this.f1668a;
                if (i12 >= iArr.length) {
                    this.f1668a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1669b;
                    this.f1669b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1668a;
                int i13 = this.f1670c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f1669b;
                this.f1670c = i13 + 1;
                iArr4[i13] = i11;
            }

            void c(int i10, String str) {
                int i11 = this.f1676i;
                int[] iArr = this.f1674g;
                if (i11 >= iArr.length) {
                    this.f1674g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1675h;
                    this.f1675h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1674g;
                int i12 = this.f1676i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f1675h;
                this.f1676i = i12 + 1;
                strArr2[i12] = str;
            }

            void d(int i10, boolean z10) {
                int i11 = this.f1679l;
                int[] iArr = this.f1677j;
                if (i11 >= iArr.length) {
                    this.f1677j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1678k;
                    this.f1678k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1677j;
                int i12 = this.f1679l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f1678k;
                this.f1679l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i10, ConstraintLayout.b bVar) {
            this.f1660a = i10;
            b bVar2 = this.f1664e;
            bVar2.f1699j = bVar.f1559e;
            bVar2.f1701k = bVar.f1561f;
            bVar2.f1703l = bVar.f1563g;
            bVar2.f1705m = bVar.f1565h;
            bVar2.f1707n = bVar.f1567i;
            bVar2.f1709o = bVar.f1569j;
            bVar2.f1711p = bVar.f1571k;
            bVar2.f1713q = bVar.f1573l;
            bVar2.f1715r = bVar.f1575m;
            bVar2.f1716s = bVar.f1577n;
            bVar2.f1717t = bVar.f1579o;
            bVar2.f1718u = bVar.f1587s;
            bVar2.f1719v = bVar.f1589t;
            bVar2.f1720w = bVar.f1591u;
            bVar2.f1721x = bVar.f1593v;
            bVar2.f1722y = bVar.G;
            bVar2.f1723z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.f1581p;
            bVar2.C = bVar.f1583q;
            bVar2.D = bVar.f1585r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.f1695h = bVar.f1555c;
            bVar2.f1691f = bVar.f1551a;
            bVar2.f1693g = bVar.f1553b;
            bVar2.f1687d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f1689e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.f1708n0 = bVar.f1552a0;
            bVar2.f1710o0 = bVar.f1554b0;
            bVar2.Z = bVar.P;
            bVar2.f1682a0 = bVar.Q;
            bVar2.f1684b0 = bVar.T;
            bVar2.f1686c0 = bVar.U;
            bVar2.f1688d0 = bVar.R;
            bVar2.f1690e0 = bVar.S;
            bVar2.f1692f0 = bVar.V;
            bVar2.f1694g0 = bVar.W;
            bVar2.f1706m0 = bVar.f1556c0;
            bVar2.P = bVar.f1597x;
            bVar2.R = bVar.f1599z;
            bVar2.O = bVar.f1595w;
            bVar2.Q = bVar.f1598y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.f1714q0 = bVar.f1558d0;
            bVar2.L = bVar.getMarginEnd();
            this.f1664e.M = bVar.getMarginStart();
        }

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f1664e;
            bVar.f1559e = bVar2.f1699j;
            bVar.f1561f = bVar2.f1701k;
            bVar.f1563g = bVar2.f1703l;
            bVar.f1565h = bVar2.f1705m;
            bVar.f1567i = bVar2.f1707n;
            bVar.f1569j = bVar2.f1709o;
            bVar.f1571k = bVar2.f1711p;
            bVar.f1573l = bVar2.f1713q;
            bVar.f1575m = bVar2.f1715r;
            bVar.f1577n = bVar2.f1716s;
            bVar.f1579o = bVar2.f1717t;
            bVar.f1587s = bVar2.f1718u;
            bVar.f1589t = bVar2.f1719v;
            bVar.f1591u = bVar2.f1720w;
            bVar.f1593v = bVar2.f1721x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.f1597x = bVar2.P;
            bVar.f1599z = bVar2.R;
            bVar.G = bVar2.f1722y;
            bVar.H = bVar2.f1723z;
            bVar.f1581p = bVar2.B;
            bVar.f1583q = bVar2.C;
            bVar.f1585r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.f1552a0 = bVar2.f1708n0;
            bVar.f1554b0 = bVar2.f1710o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.f1682a0;
            bVar.T = bVar2.f1684b0;
            bVar.U = bVar2.f1686c0;
            bVar.R = bVar2.f1688d0;
            bVar.S = bVar2.f1690e0;
            bVar.V = bVar2.f1692f0;
            bVar.W = bVar2.f1694g0;
            bVar.Z = bVar2.G;
            bVar.f1555c = bVar2.f1695h;
            bVar.f1551a = bVar2.f1691f;
            bVar.f1553b = bVar2.f1693g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f1687d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f1689e;
            String str = bVar2.f1706m0;
            if (str != null) {
                bVar.f1556c0 = str;
            }
            bVar.f1558d0 = bVar2.f1714q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.f1664e.L);
            bVar.a();
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f1664e.a(this.f1664e);
            aVar.f1663d.a(this.f1663d);
            aVar.f1662c.a(this.f1662c);
            aVar.f1665f.a(this.f1665f);
            aVar.f1660a = this.f1660a;
            aVar.f1667h = this.f1667h;
            return aVar;
        }
    }

    public static class b {

        /* renamed from: r0, reason: collision with root package name */
        private static SparseIntArray f1680r0;

        /* renamed from: d, reason: collision with root package name */
        public int f1687d;

        /* renamed from: e, reason: collision with root package name */
        public int f1689e;

        /* renamed from: k0, reason: collision with root package name */
        public int[] f1702k0;

        /* renamed from: l0, reason: collision with root package name */
        public String f1704l0;

        /* renamed from: m0, reason: collision with root package name */
        public String f1706m0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f1681a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1683b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1685c = false;

        /* renamed from: f, reason: collision with root package name */
        public int f1691f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f1693g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f1695h = -1.0f;

        /* renamed from: i, reason: collision with root package name */
        public boolean f1697i = true;

        /* renamed from: j, reason: collision with root package name */
        public int f1699j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f1701k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f1703l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f1705m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f1707n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f1709o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f1711p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f1713q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f1715r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f1716s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f1717t = -1;

        /* renamed from: u, reason: collision with root package name */
        public int f1718u = -1;

        /* renamed from: v, reason: collision with root package name */
        public int f1719v = -1;

        /* renamed from: w, reason: collision with root package name */
        public int f1720w = -1;

        /* renamed from: x, reason: collision with root package name */
        public int f1721x = -1;

        /* renamed from: y, reason: collision with root package name */
        public float f1722y = 0.5f;

        /* renamed from: z, reason: collision with root package name */
        public float f1723z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public int U = Integer.MIN_VALUE;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a0, reason: collision with root package name */
        public int f1682a0 = 0;

        /* renamed from: b0, reason: collision with root package name */
        public int f1684b0 = 0;

        /* renamed from: c0, reason: collision with root package name */
        public int f1686c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public int f1688d0 = 0;

        /* renamed from: e0, reason: collision with root package name */
        public int f1690e0 = 0;

        /* renamed from: f0, reason: collision with root package name */
        public float f1692f0 = 1.0f;

        /* renamed from: g0, reason: collision with root package name */
        public float f1694g0 = 1.0f;

        /* renamed from: h0, reason: collision with root package name */
        public int f1696h0 = -1;

        /* renamed from: i0, reason: collision with root package name */
        public int f1698i0 = 0;

        /* renamed from: j0, reason: collision with root package name */
        public int f1700j0 = -1;

        /* renamed from: n0, reason: collision with root package name */
        public boolean f1708n0 = false;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f1710o0 = false;

        /* renamed from: p0, reason: collision with root package name */
        public boolean f1712p0 = true;

        /* renamed from: q0, reason: collision with root package name */
        public int f1714q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1680r0 = sparseIntArray;
            sparseIntArray.append(g.f1951w5, 24);
            f1680r0.append(g.f1959x5, 25);
            f1680r0.append(g.f1975z5, 28);
            f1680r0.append(g.A5, 29);
            f1680r0.append(g.F5, 35);
            f1680r0.append(g.E5, 34);
            f1680r0.append(g.f1817g5, 4);
            f1680r0.append(g.f5, 3);
            f1680r0.append(g.f1792d5, 1);
            f1680r0.append(g.L5, 6);
            f1680r0.append(g.M5, 7);
            f1680r0.append(g.n5, 17);
            f1680r0.append(g.f1887o5, 18);
            f1680r0.append(g.f1895p5, 19);
            f1680r0.append(g.Z4, 90);
            f1680r0.append(g.L4, 26);
            f1680r0.append(g.B5, 31);
            f1680r0.append(g.C5, 32);
            f1680r0.append(g.f1871m5, 10);
            f1680r0.append(g.f1862l5, 9);
            f1680r0.append(g.P5, 13);
            f1680r0.append(g.S5, 16);
            f1680r0.append(g.Q5, 14);
            f1680r0.append(g.N5, 11);
            f1680r0.append(g.R5, 15);
            f1680r0.append(g.O5, 12);
            f1680r0.append(g.I5, 38);
            f1680r0.append(g.f1935u5, 37);
            f1680r0.append(g.f1927t5, 39);
            f1680r0.append(g.H5, 40);
            f1680r0.append(g.f1919s5, 20);
            f1680r0.append(g.G5, 36);
            f1680r0.append(g.f1853k5, 5);
            f1680r0.append(g.f1943v5, 91);
            f1680r0.append(g.D5, 91);
            f1680r0.append(g.f1967y5, 91);
            f1680r0.append(g.e5, 91);
            f1680r0.append(g.f1783c5, 91);
            f1680r0.append(g.O4, 23);
            f1680r0.append(g.Q4, 27);
            f1680r0.append(g.S4, 30);
            f1680r0.append(g.T4, 8);
            f1680r0.append(g.P4, 33);
            f1680r0.append(g.R4, 2);
            f1680r0.append(g.M4, 22);
            f1680r0.append(g.N4, 21);
            f1680r0.append(g.J5, 41);
            f1680r0.append(g.f1903q5, 42);
            f1680r0.append(g.f1774b5, 41);
            f1680r0.append(g.f1765a5, 42);
            f1680r0.append(g.T5, 76);
            f1680r0.append(g.f1826h5, 61);
            f1680r0.append(g.f1844j5, 62);
            f1680r0.append(g.f1835i5, 63);
            f1680r0.append(g.K5, 69);
            f1680r0.append(g.f1911r5, 70);
            f1680r0.append(g.X4, 71);
            f1680r0.append(g.V4, 72);
            f1680r0.append(g.W4, 73);
            f1680r0.append(g.Y4, 74);
            f1680r0.append(g.U4, 75);
        }

        public void a(b bVar) {
            this.f1681a = bVar.f1681a;
            this.f1687d = bVar.f1687d;
            this.f1683b = bVar.f1683b;
            this.f1689e = bVar.f1689e;
            this.f1691f = bVar.f1691f;
            this.f1693g = bVar.f1693g;
            this.f1695h = bVar.f1695h;
            this.f1697i = bVar.f1697i;
            this.f1699j = bVar.f1699j;
            this.f1701k = bVar.f1701k;
            this.f1703l = bVar.f1703l;
            this.f1705m = bVar.f1705m;
            this.f1707n = bVar.f1707n;
            this.f1709o = bVar.f1709o;
            this.f1711p = bVar.f1711p;
            this.f1713q = bVar.f1713q;
            this.f1715r = bVar.f1715r;
            this.f1716s = bVar.f1716s;
            this.f1717t = bVar.f1717t;
            this.f1718u = bVar.f1718u;
            this.f1719v = bVar.f1719v;
            this.f1720w = bVar.f1720w;
            this.f1721x = bVar.f1721x;
            this.f1722y = bVar.f1722y;
            this.f1723z = bVar.f1723z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f1682a0 = bVar.f1682a0;
            this.f1684b0 = bVar.f1684b0;
            this.f1686c0 = bVar.f1686c0;
            this.f1688d0 = bVar.f1688d0;
            this.f1690e0 = bVar.f1690e0;
            this.f1692f0 = bVar.f1692f0;
            this.f1694g0 = bVar.f1694g0;
            this.f1696h0 = bVar.f1696h0;
            this.f1698i0 = bVar.f1698i0;
            this.f1700j0 = bVar.f1700j0;
            this.f1706m0 = bVar.f1706m0;
            int[] iArr = bVar.f1702k0;
            if (iArr == null || bVar.f1704l0 != null) {
                this.f1702k0 = null;
            } else {
                this.f1702k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f1704l0 = bVar.f1704l0;
            this.f1708n0 = bVar.f1708n0;
            this.f1710o0 = bVar.f1710o0;
            this.f1712p0 = bVar.f1712p0;
            this.f1714q0 = bVar.f1714q0;
        }

        void b(Context context, AttributeSet attributeSet) throws NumberFormatException {
            StringBuilder sb2;
            String str;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.K4);
            this.f1683b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f1680r0.get(index);
                switch (i11) {
                    case 1:
                        this.f1715r = d.n(typedArrayObtainStyledAttributes, index, this.f1715r);
                        break;
                    case 2:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.f1713q = d.n(typedArrayObtainStyledAttributes, index, this.f1713q);
                        break;
                    case 4:
                        this.f1711p = d.n(typedArrayObtainStyledAttributes, index, this.f1711p);
                        break;
                    case 5:
                        this.A = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.f1721x = d.n(typedArrayObtainStyledAttributes, index, this.f1721x);
                        break;
                    case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                        this.f1720w = d.n(typedArrayObtainStyledAttributes, index, this.f1720w);
                        break;
                    case 11:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f1691f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1691f);
                        break;
                    case 18:
                        this.f1693g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1693g);
                        break;
                    case 19:
                        this.f1695h = typedArrayObtainStyledAttributes.getFloat(index, this.f1695h);
                        break;
                    case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                        this.f1722y = typedArrayObtainStyledAttributes.getFloat(index, this.f1722y);
                        break;
                    case 21:
                        this.f1689e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1689e);
                        break;
                    case 22:
                        this.f1687d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1687d);
                        break;
                    case 23:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.f1699j = d.n(typedArrayObtainStyledAttributes, index, this.f1699j);
                        break;
                    case 25:
                        this.f1701k = d.n(typedArrayObtainStyledAttributes, index, this.f1701k);
                        break;
                    case 26:
                        this.G = typedArrayObtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.f1703l = d.n(typedArrayObtainStyledAttributes, index, this.f1703l);
                        break;
                    case 29:
                        this.f1705m = d.n(typedArrayObtainStyledAttributes, index, this.f1705m);
                        break;
                    case 30:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.f1718u = d.n(typedArrayObtainStyledAttributes, index, this.f1718u);
                        break;
                    case 32:
                        this.f1719v = d.n(typedArrayObtainStyledAttributes, index, this.f1719v);
                        break;
                    case 33:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f1709o = d.n(typedArrayObtainStyledAttributes, index, this.f1709o);
                        break;
                    case 35:
                        this.f1707n = d.n(typedArrayObtainStyledAttributes, index, this.f1707n);
                        break;
                    case 36:
                        this.f1723z = typedArrayObtainStyledAttributes.getFloat(index, this.f1723z);
                        break;
                    case 37:
                        this.W = typedArrayObtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        d.o(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.o(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.B = d.n(typedArrayObtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = typedArrayObtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f1692f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.f1694g0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.f1696h0 = typedArrayObtainStyledAttributes.getInt(index, this.f1696h0);
                                        continue;
                                    case 73:
                                        this.f1698i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1698i0);
                                        continue;
                                    case 74:
                                        this.f1704l0 = typedArrayObtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.f1712p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1712p0);
                                        continue;
                                    case 76:
                                        this.f1714q0 = typedArrayObtainStyledAttributes.getInt(index, this.f1714q0);
                                        continue;
                                    case 77:
                                        this.f1716s = d.n(typedArrayObtainStyledAttributes, index, this.f1716s);
                                        continue;
                                    case ModuleDescriptor.MODULE_VERSION /* 78 */:
                                        this.f1717t = d.n(typedArrayObtainStyledAttributes, index, this.f1717t);
                                        continue;
                                    case 79:
                                        this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        continue;
                                    case 80:
                                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        continue;
                                    case 81:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 82:
                                        this.f1682a0 = typedArrayObtainStyledAttributes.getInt(index, this.f1682a0);
                                        continue;
                                    case 83:
                                        this.f1686c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1686c0);
                                        continue;
                                    case 84:
                                        this.f1684b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1684b0);
                                        continue;
                                    case 85:
                                        this.f1690e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1690e0);
                                        continue;
                                    case 86:
                                        this.f1688d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1688d0);
                                        continue;
                                    case 87:
                                        this.f1708n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1708n0);
                                        continue;
                                    case 88:
                                        this.f1710o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1710o0);
                                        continue;
                                    case 89:
                                        this.f1706m0 = typedArrayObtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.f1697i = typedArrayObtainStyledAttributes.getBoolean(index, this.f1697i);
                                        continue;
                                    case 91:
                                        sb2 = new StringBuilder();
                                        str = "unused attribute 0x";
                                        break;
                                    default:
                                        sb2 = new StringBuilder();
                                        str = "Unknown attribute 0x";
                                        break;
                                }
                                sb2.append(str);
                                sb2.append(Integer.toHexString(index));
                                sb2.append("   ");
                                sb2.append(f1680r0.get(index));
                                Log.w("ConstraintSet", sb2.toString());
                                break;
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* renamed from: o, reason: collision with root package name */
        private static SparseIntArray f1724o;

        /* renamed from: a, reason: collision with root package name */
        public boolean f1725a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f1726b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f1727c = 0;

        /* renamed from: d, reason: collision with root package name */
        public String f1728d = null;

        /* renamed from: e, reason: collision with root package name */
        public int f1729e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f1730f = 0;

        /* renamed from: g, reason: collision with root package name */
        public float f1731g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public int f1732h = -1;

        /* renamed from: i, reason: collision with root package name */
        public float f1733i = Float.NaN;

        /* renamed from: j, reason: collision with root package name */
        public float f1734j = Float.NaN;

        /* renamed from: k, reason: collision with root package name */
        public int f1735k = -1;

        /* renamed from: l, reason: collision with root package name */
        public String f1736l = null;

        /* renamed from: m, reason: collision with root package name */
        public int f1737m = -3;

        /* renamed from: n, reason: collision with root package name */
        public int f1738n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1724o = sparseIntArray;
            sparseIntArray.append(g.f1809f6, 1);
            f1724o.append(g.f1827h6, 2);
            f1724o.append(g.f1863l6, 3);
            f1724o.append(g.f1801e6, 4);
            f1724o.append(g.f1793d6, 5);
            f1724o.append(g.f1784c6, 6);
            f1724o.append(g.f1818g6, 7);
            f1724o.append(g.f1854k6, 8);
            f1724o.append(g.f1845j6, 9);
            f1724o.append(g.f1836i6, 10);
        }

        public void a(c cVar) {
            this.f1725a = cVar.f1725a;
            this.f1726b = cVar.f1726b;
            this.f1728d = cVar.f1728d;
            this.f1729e = cVar.f1729e;
            this.f1730f = cVar.f1730f;
            this.f1733i = cVar.f1733i;
            this.f1731g = cVar.f1731g;
            this.f1732h = cVar.f1732h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f1775b6);
            this.f1725a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f1724o.get(index)) {
                    case 1:
                        this.f1733i = typedArrayObtainStyledAttributes.getFloat(index, this.f1733i);
                        break;
                    case 2:
                        this.f1729e = typedArrayObtainStyledAttributes.getInt(index, this.f1729e);
                        break;
                    case 3:
                        this.f1728d = typedArrayObtainStyledAttributes.peekValue(index).type == 3 ? typedArrayObtainStyledAttributes.getString(index) : s.a.f26691c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f1730f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1726b = d.n(typedArrayObtainStyledAttributes, index, this.f1726b);
                        break;
                    case 6:
                        this.f1727c = typedArrayObtainStyledAttributes.getInteger(index, this.f1727c);
                        break;
                    case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                        this.f1731g = typedArrayObtainStyledAttributes.getFloat(index, this.f1731g);
                        break;
                    case 8:
                        this.f1735k = typedArrayObtainStyledAttributes.getInteger(index, this.f1735k);
                        break;
                    case 9:
                        this.f1734j = typedArrayObtainStyledAttributes.getFloat(index, this.f1734j);
                        break;
                    case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f1738n = resourceId;
                            if (resourceId != -1) {
                                this.f1737m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i11 != 3) {
                            this.f1737m = typedArrayObtainStyledAttributes.getInteger(index, this.f1738n);
                            break;
                        } else {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f1736l = string;
                            if (string.indexOf("/") <= 0) {
                                this.f1737m = -1;
                                break;
                            } else {
                                this.f1738n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f1737m = -2;
                            }
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C0017d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1739a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f1740b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f1741c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f1742d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f1743e = Float.NaN;

        public void a(C0017d c0017d) {
            this.f1739a = c0017d.f1739a;
            this.f1740b = c0017d.f1740b;
            this.f1742d = c0017d.f1742d;
            this.f1743e = c0017d.f1743e;
            this.f1741c = c0017d.f1741c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f1952w6);
            this.f1739a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.f1968y6) {
                    this.f1742d = typedArrayObtainStyledAttributes.getFloat(index, this.f1742d);
                } else if (index == g.f1960x6) {
                    this.f1740b = typedArrayObtainStyledAttributes.getInt(index, this.f1740b);
                    this.f1740b = d.f1652f[this.f1740b];
                } else if (index == g.A6) {
                    this.f1741c = typedArrayObtainStyledAttributes.getInt(index, this.f1741c);
                } else if (index == g.f1976z6) {
                    this.f1743e = typedArrayObtainStyledAttributes.getFloat(index, this.f1743e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* renamed from: o, reason: collision with root package name */
        private static SparseIntArray f1744o;

        /* renamed from: a, reason: collision with root package name */
        public boolean f1745a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f1746b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f1747c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f1748d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f1749e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f1750f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f1751g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f1752h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public int f1753i = -1;

        /* renamed from: j, reason: collision with root package name */
        public float f1754j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f1755k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public float f1756l = 0.0f;

        /* renamed from: m, reason: collision with root package name */
        public boolean f1757m = false;

        /* renamed from: n, reason: collision with root package name */
        public float f1758n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1744o = sparseIntArray;
            sparseIntArray.append(g.V6, 1);
            f1744o.append(g.W6, 2);
            f1744o.append(g.X6, 3);
            f1744o.append(g.T6, 4);
            f1744o.append(g.U6, 5);
            f1744o.append(g.P6, 6);
            f1744o.append(g.Q6, 7);
            f1744o.append(g.R6, 8);
            f1744o.append(g.S6, 9);
            f1744o.append(g.Y6, 10);
            f1744o.append(g.Z6, 11);
            f1744o.append(g.f1767a7, 12);
        }

        public void a(e eVar) {
            this.f1745a = eVar.f1745a;
            this.f1746b = eVar.f1746b;
            this.f1747c = eVar.f1747c;
            this.f1748d = eVar.f1748d;
            this.f1749e = eVar.f1749e;
            this.f1750f = eVar.f1750f;
            this.f1751g = eVar.f1751g;
            this.f1752h = eVar.f1752h;
            this.f1753i = eVar.f1753i;
            this.f1754j = eVar.f1754j;
            this.f1755k = eVar.f1755k;
            this.f1756l = eVar.f1756l;
            this.f1757m = eVar.f1757m;
            this.f1758n = eVar.f1758n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.O6);
            this.f1745a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f1744o.get(index)) {
                    case 1:
                        this.f1746b = typedArrayObtainStyledAttributes.getFloat(index, this.f1746b);
                        break;
                    case 2:
                        this.f1747c = typedArrayObtainStyledAttributes.getFloat(index, this.f1747c);
                        break;
                    case 3:
                        this.f1748d = typedArrayObtainStyledAttributes.getFloat(index, this.f1748d);
                        break;
                    case 4:
                        this.f1749e = typedArrayObtainStyledAttributes.getFloat(index, this.f1749e);
                        break;
                    case 5:
                        this.f1750f = typedArrayObtainStyledAttributes.getFloat(index, this.f1750f);
                        break;
                    case 6:
                        this.f1751g = typedArrayObtainStyledAttributes.getDimension(index, this.f1751g);
                        break;
                    case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                        this.f1752h = typedArrayObtainStyledAttributes.getDimension(index, this.f1752h);
                        break;
                    case 8:
                        this.f1754j = typedArrayObtainStyledAttributes.getDimension(index, this.f1754j);
                        break;
                    case 9:
                        this.f1755k = typedArrayObtainStyledAttributes.getDimension(index, this.f1755k);
                        break;
                    case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                        this.f1756l = typedArrayObtainStyledAttributes.getDimension(index, this.f1756l);
                        break;
                    case 11:
                        this.f1757m = true;
                        this.f1758n = typedArrayObtainStyledAttributes.getDimension(index, this.f1758n);
                        break;
                    case 12:
                        this.f1753i = d.n(typedArrayObtainStyledAttributes, index, this.f1753i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f1653g.append(g.A0, 25);
        f1653g.append(g.B0, 26);
        f1653g.append(g.D0, 29);
        f1653g.append(g.E0, 30);
        f1653g.append(g.K0, 36);
        f1653g.append(g.J0, 35);
        f1653g.append(g.f1821h0, 4);
        f1653g.append(g.f1812g0, 3);
        f1653g.append(g.f1778c0, 1);
        f1653g.append(g.f1796e0, 91);
        f1653g.append(g.f1787d0, 92);
        f1653g.append(g.T0, 6);
        f1653g.append(g.U0, 7);
        f1653g.append(g.f1882o0, 17);
        f1653g.append(g.f1890p0, 18);
        f1653g.append(g.f1898q0, 19);
        f1653g.append(g.Y, 99);
        f1653g.append(g.f1929u, 27);
        f1653g.append(g.F0, 32);
        f1653g.append(g.G0, 33);
        f1653g.append(g.f1875n0, 10);
        f1653g.append(g.f1866m0, 9);
        f1653g.append(g.X0, 13);
        f1653g.append(g.f1761a1, 16);
        f1653g.append(g.Y0, 14);
        f1653g.append(g.V0, 11);
        f1653g.append(g.Z0, 15);
        f1653g.append(g.W0, 12);
        f1653g.append(g.N0, 40);
        f1653g.append(g.f1962y0, 39);
        f1653g.append(g.f1954x0, 41);
        f1653g.append(g.M0, 42);
        f1653g.append(g.f1946w0, 20);
        f1653g.append(g.L0, 37);
        f1653g.append(g.f1857l0, 5);
        f1653g.append(g.f1970z0, 87);
        f1653g.append(g.I0, 87);
        f1653g.append(g.C0, 87);
        f1653g.append(g.f1804f0, 87);
        f1653g.append(g.f1769b0, 87);
        f1653g.append(g.f1969z, 24);
        f1653g.append(g.B, 28);
        f1653g.append(g.N, 31);
        f1653g.append(g.O, 8);
        f1653g.append(g.A, 34);
        f1653g.append(g.C, 2);
        f1653g.append(g.f1953x, 23);
        f1653g.append(g.f1961y, 21);
        f1653g.append(g.O0, 95);
        f1653g.append(g.f1906r0, 96);
        f1653g.append(g.f1945w, 22);
        f1653g.append(g.D, 43);
        f1653g.append(g.Q, 44);
        f1653g.append(g.L, 45);
        f1653g.append(g.M, 46);
        f1653g.append(g.K, 60);
        f1653g.append(g.I, 47);
        f1653g.append(g.J, 48);
        f1653g.append(g.E, 49);
        f1653g.append(g.F, 50);
        f1653g.append(g.G, 51);
        f1653g.append(g.H, 52);
        f1653g.append(g.P, 53);
        f1653g.append(g.P0, 54);
        f1653g.append(g.f1914s0, 55);
        f1653g.append(g.Q0, 56);
        f1653g.append(g.f1922t0, 57);
        f1653g.append(g.R0, 58);
        f1653g.append(g.f1930u0, 59);
        f1653g.append(g.f1830i0, 61);
        f1653g.append(g.f1848k0, 62);
        f1653g.append(g.f1839j0, 63);
        f1653g.append(g.R, 64);
        f1653g.append(g.f1849k1, 65);
        f1653g.append(g.X, 66);
        f1653g.append(g.f1858l1, 67);
        f1653g.append(g.f1788d1, 79);
        f1653g.append(g.f1937v, 38);
        f1653g.append(g.f1779c1, 68);
        f1653g.append(g.S0, 69);
        f1653g.append(g.f1938v0, 70);
        f1653g.append(g.f1770b1, 97);
        f1653g.append(g.V, 71);
        f1653g.append(g.T, 72);
        f1653g.append(g.U, 73);
        f1653g.append(g.W, 74);
        f1653g.append(g.S, 75);
        f1653g.append(g.f1797e1, 76);
        f1653g.append(g.H0, 77);
        f1653g.append(g.f1867m1, 78);
        f1653g.append(g.f1760a0, 80);
        f1653g.append(g.Z, 81);
        f1653g.append(g.f1805f1, 82);
        f1653g.append(g.f1840j1, 83);
        f1653g.append(g.f1831i1, 84);
        f1653g.append(g.f1822h1, 85);
        f1653g.append(g.f1813g1, 86);
        SparseIntArray sparseIntArray = f1654h;
        int i10 = g.P3;
        sparseIntArray.append(i10, 6);
        f1654h.append(i10, 7);
        f1654h.append(g.K2, 27);
        f1654h.append(g.S3, 13);
        f1654h.append(g.V3, 16);
        f1654h.append(g.T3, 14);
        f1654h.append(g.Q3, 11);
        f1654h.append(g.U3, 15);
        f1654h.append(g.R3, 12);
        f1654h.append(g.J3, 40);
        f1654h.append(g.C3, 39);
        f1654h.append(g.B3, 41);
        f1654h.append(g.I3, 42);
        f1654h.append(g.A3, 20);
        f1654h.append(g.H3, 37);
        f1654h.append(g.f1933u3, 5);
        f1654h.append(g.D3, 87);
        f1654h.append(g.G3, 87);
        f1654h.append(g.E3, 87);
        f1654h.append(g.f1909r3, 87);
        f1654h.append(g.f1901q3, 87);
        f1654h.append(g.P2, 24);
        f1654h.append(g.R2, 28);
        f1654h.append(g.f1790d3, 31);
        f1654h.append(g.f1799e3, 8);
        f1654h.append(g.Q2, 34);
        f1654h.append(g.S2, 2);
        f1654h.append(g.N2, 23);
        f1654h.append(g.O2, 21);
        f1654h.append(g.K3, 95);
        f1654h.append(g.f1941v3, 96);
        f1654h.append(g.M2, 22);
        f1654h.append(g.T2, 43);
        f1654h.append(g.f1815g3, 44);
        f1654h.append(g.f1772b3, 45);
        f1654h.append(g.f1781c3, 46);
        f1654h.append(g.f1763a3, 60);
        f1654h.append(g.Y2, 47);
        f1654h.append(g.Z2, 48);
        f1654h.append(g.U2, 49);
        f1654h.append(g.V2, 50);
        f1654h.append(g.W2, 51);
        f1654h.append(g.X2, 52);
        f1654h.append(g.f1807f3, 53);
        f1654h.append(g.L3, 54);
        f1654h.append(g.f1949w3, 55);
        f1654h.append(g.M3, 56);
        f1654h.append(g.f1957x3, 57);
        f1654h.append(g.N3, 58);
        f1654h.append(g.f1965y3, 59);
        f1654h.append(g.f1925t3, 62);
        f1654h.append(g.f1917s3, 63);
        f1654h.append(g.f1824h3, 64);
        f1654h.append(g.f1816g4, 65);
        f1654h.append(g.f1878n3, 66);
        f1654h.append(g.f1825h4, 67);
        f1654h.append(g.Y3, 79);
        f1654h.append(g.L2, 38);
        f1654h.append(g.Z3, 98);
        f1654h.append(g.X3, 68);
        f1654h.append(g.O3, 69);
        f1654h.append(g.f1973z3, 70);
        f1654h.append(g.f1860l3, 71);
        f1654h.append(g.f1842j3, 72);
        f1654h.append(g.f1851k3, 73);
        f1654h.append(g.f1869m3, 74);
        f1654h.append(g.f1833i3, 75);
        f1654h.append(g.f1764a4, 76);
        f1654h.append(g.F3, 77);
        f1654h.append(g.f1834i4, 78);
        f1654h.append(g.f1893p3, 80);
        f1654h.append(g.f1885o3, 81);
        f1654h.append(g.f1773b4, 82);
        f1654h.append(g.f1808f4, 83);
        f1654h.append(g.f1800e4, 84);
        f1654h.append(g.f1791d4, 85);
        f1654h.append(g.f1782c4, 86);
        f1654h.append(g.W3, 97);
    }

    private int[] i(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object objG;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = f.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objG = ((ConstraintLayout) view.getParent()).g(0, strTrim)) != null && (objG instanceof Integer)) {
                iIntValue = ((Integer) objG).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    private a j(Context context, AttributeSet attributeSet, boolean z10) throws NumberFormatException {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? g.J2 : g.f1921t);
        r(context, aVar, typedArrayObtainStyledAttributes, z10);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a k(int i10) {
        if (!this.f1659e.containsKey(Integer.valueOf(i10))) {
            this.f1659e.put(Integer.valueOf(i10), new a());
        }
        return (a) this.f1659e.get(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    static void o(Object obj, TypedArray typedArray, int i10, int i11) throws NumberFormatException {
        int i12;
        if (obj == null) {
            return;
        }
        int i13 = typedArray.peekValue(i10).type;
        if (i13 == 3) {
            p(obj, typedArray.getString(i10), i11);
            return;
        }
        int dimensionPixelSize = -2;
        boolean z10 = false;
        if (i13 != 5) {
            int i14 = typedArray.getInt(i10, 0);
            if (i14 != -4) {
                dimensionPixelSize = (i14 == -3 || !(i14 == -2 || i14 == -1)) ? 0 : i14;
            } else {
                z10 = true;
            }
        } else {
            dimensionPixelSize = typedArray.getDimensionPixelSize(i10, 0);
        }
        if (obj instanceof ConstraintLayout.b) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
            if (i11 == 0) {
                ((ViewGroup.MarginLayoutParams) bVar).width = dimensionPixelSize;
                bVar.f1552a0 = z10;
                return;
            } else {
                ((ViewGroup.MarginLayoutParams) bVar).height = dimensionPixelSize;
                bVar.f1554b0 = z10;
                return;
            }
        }
        if (obj instanceof b) {
            b bVar2 = (b) obj;
            if (i11 == 0) {
                bVar2.f1687d = dimensionPixelSize;
                bVar2.f1708n0 = z10;
                return;
            } else {
                bVar2.f1689e = dimensionPixelSize;
                bVar2.f1710o0 = z10;
                return;
            }
        }
        if (obj instanceof a.C0016a) {
            a.C0016a c0016a = (a.C0016a) obj;
            if (i11 == 0) {
                c0016a.b(23, dimensionPixelSize);
                i12 = 80;
            } else {
                c0016a.b(21, dimensionPixelSize);
                i12 = 81;
            }
            c0016a.d(i12, z10);
        }
    }

    static void p(Object obj, String str, int i10) throws NumberFormatException {
        int i11;
        int i12;
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    q(bVar, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).A = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0016a) {
                        ((a.C0016a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f5 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.L = f5;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.M = f5;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i10 == 0) {
                            bVar3.f1687d = 0;
                            bVar3.W = f5;
                            return;
                        } else {
                            bVar3.f1689e = 0;
                            bVar3.V = f5;
                            return;
                        }
                    }
                    if (obj instanceof a.C0016a) {
                        a.C0016a c0016a = (a.C0016a) obj;
                        if (i10 == 0) {
                            c0016a.b(23, 0);
                            i12 = 39;
                        } else {
                            c0016a.b(21, 0);
                            i12 = 40;
                        }
                        c0016a.a(i12, f5);
                        return;
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.V = fMax;
                            bVar4.P = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.W = fMax;
                            bVar4.Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i10 == 0) {
                            bVar5.f1687d = 0;
                            bVar5.f1692f0 = fMax;
                            bVar5.Z = 2;
                            return;
                        } else {
                            bVar5.f1689e = 0;
                            bVar5.f1694g0 = fMax;
                            bVar5.f1682a0 = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0016a) {
                        a.C0016a c0016a2 = (a.C0016a) obj;
                        if (i10 == 0) {
                            c0016a2.b(23, 0);
                            i11 = 54;
                        } else {
                            c0016a2.b(21, 0);
                            i11 = 55;
                        }
                        c0016a2.b(i11, 2);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    static void q(ConstraintLayout.b bVar, String str) throws NumberFormatException {
        float fAbs = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i11 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i10 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i11);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i11, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f5 = Float.parseFloat(strSubstring3);
                        float f10 = Float.parseFloat(strSubstring4);
                        if (f5 > 0.0f && f10 > 0.0f) {
                            fAbs = i10 == 1 ? Math.abs(f10 / f5) : Math.abs(f5 / f10);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.I = str;
        bVar.J = fAbs;
        bVar.K = i10;
    }

    private void r(Context context, a aVar, TypedArray typedArray, boolean z10) throws NumberFormatException {
        c cVar;
        String string;
        c cVar2;
        StringBuilder sb2;
        String str;
        if (z10) {
            s(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != g.f1937v && g.N != index && g.O != index) {
                aVar.f1663d.f1725a = true;
                aVar.f1664e.f1683b = true;
                aVar.f1662c.f1739a = true;
                aVar.f1665f.f1745a = true;
            }
            switch (f1653g.get(index)) {
                case 1:
                    b bVar = aVar.f1664e;
                    bVar.f1715r = n(typedArray, index, bVar.f1715r);
                    continue;
                case 2:
                    b bVar2 = aVar.f1664e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    continue;
                case 3:
                    b bVar3 = aVar.f1664e;
                    bVar3.f1713q = n(typedArray, index, bVar3.f1713q);
                    continue;
                case 4:
                    b bVar4 = aVar.f1664e;
                    bVar4.f1711p = n(typedArray, index, bVar4.f1711p);
                    continue;
                case 5:
                    aVar.f1664e.A = typedArray.getString(index);
                    continue;
                case 6:
                    b bVar5 = aVar.f1664e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    continue;
                case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                    b bVar6 = aVar.f1664e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    continue;
                case 8:
                    b bVar7 = aVar.f1664e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    continue;
                case 9:
                    b bVar8 = aVar.f1664e;
                    bVar8.f1721x = n(typedArray, index, bVar8.f1721x);
                    continue;
                case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                    b bVar9 = aVar.f1664e;
                    bVar9.f1720w = n(typedArray, index, bVar9.f1720w);
                    continue;
                case 11:
                    b bVar10 = aVar.f1664e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    continue;
                case 12:
                    b bVar11 = aVar.f1664e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    continue;
                case 13:
                    b bVar12 = aVar.f1664e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    continue;
                case 14:
                    b bVar13 = aVar.f1664e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    continue;
                case 15:
                    b bVar14 = aVar.f1664e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    continue;
                case 16:
                    b bVar15 = aVar.f1664e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    continue;
                case 17:
                    b bVar16 = aVar.f1664e;
                    bVar16.f1691f = typedArray.getDimensionPixelOffset(index, bVar16.f1691f);
                    continue;
                case 18:
                    b bVar17 = aVar.f1664e;
                    bVar17.f1693g = typedArray.getDimensionPixelOffset(index, bVar17.f1693g);
                    continue;
                case 19:
                    b bVar18 = aVar.f1664e;
                    bVar18.f1695h = typedArray.getFloat(index, bVar18.f1695h);
                    continue;
                case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                    b bVar19 = aVar.f1664e;
                    bVar19.f1722y = typedArray.getFloat(index, bVar19.f1722y);
                    continue;
                case 21:
                    b bVar20 = aVar.f1664e;
                    bVar20.f1689e = typedArray.getLayoutDimension(index, bVar20.f1689e);
                    continue;
                case 22:
                    C0017d c0017d = aVar.f1662c;
                    c0017d.f1740b = typedArray.getInt(index, c0017d.f1740b);
                    C0017d c0017d2 = aVar.f1662c;
                    c0017d2.f1740b = f1652f[c0017d2.f1740b];
                    continue;
                case 23:
                    b bVar21 = aVar.f1664e;
                    bVar21.f1687d = typedArray.getLayoutDimension(index, bVar21.f1687d);
                    continue;
                case 24:
                    b bVar22 = aVar.f1664e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    continue;
                case 25:
                    b bVar23 = aVar.f1664e;
                    bVar23.f1699j = n(typedArray, index, bVar23.f1699j);
                    continue;
                case 26:
                    b bVar24 = aVar.f1664e;
                    bVar24.f1701k = n(typedArray, index, bVar24.f1701k);
                    continue;
                case 27:
                    b bVar25 = aVar.f1664e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    continue;
                case 28:
                    b bVar26 = aVar.f1664e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    continue;
                case 29:
                    b bVar27 = aVar.f1664e;
                    bVar27.f1703l = n(typedArray, index, bVar27.f1703l);
                    continue;
                case 30:
                    b bVar28 = aVar.f1664e;
                    bVar28.f1705m = n(typedArray, index, bVar28.f1705m);
                    continue;
                case 31:
                    b bVar29 = aVar.f1664e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    continue;
                case 32:
                    b bVar30 = aVar.f1664e;
                    bVar30.f1718u = n(typedArray, index, bVar30.f1718u);
                    continue;
                case 33:
                    b bVar31 = aVar.f1664e;
                    bVar31.f1719v = n(typedArray, index, bVar31.f1719v);
                    continue;
                case 34:
                    b bVar32 = aVar.f1664e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    continue;
                case 35:
                    b bVar33 = aVar.f1664e;
                    bVar33.f1709o = n(typedArray, index, bVar33.f1709o);
                    continue;
                case 36:
                    b bVar34 = aVar.f1664e;
                    bVar34.f1707n = n(typedArray, index, bVar34.f1707n);
                    continue;
                case 37:
                    b bVar35 = aVar.f1664e;
                    bVar35.f1723z = typedArray.getFloat(index, bVar35.f1723z);
                    continue;
                case 38:
                    aVar.f1660a = typedArray.getResourceId(index, aVar.f1660a);
                    continue;
                case 39:
                    b bVar36 = aVar.f1664e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    continue;
                case 40:
                    b bVar37 = aVar.f1664e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    continue;
                case 41:
                    b bVar38 = aVar.f1664e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    continue;
                case 42:
                    b bVar39 = aVar.f1664e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    continue;
                case 43:
                    C0017d c0017d3 = aVar.f1662c;
                    c0017d3.f1742d = typedArray.getFloat(index, c0017d3.f1742d);
                    continue;
                case 44:
                    e eVar = aVar.f1665f;
                    eVar.f1757m = true;
                    eVar.f1758n = typedArray.getDimension(index, eVar.f1758n);
                    continue;
                case 45:
                    e eVar2 = aVar.f1665f;
                    eVar2.f1747c = typedArray.getFloat(index, eVar2.f1747c);
                    continue;
                case 46:
                    e eVar3 = aVar.f1665f;
                    eVar3.f1748d = typedArray.getFloat(index, eVar3.f1748d);
                    continue;
                case 47:
                    e eVar4 = aVar.f1665f;
                    eVar4.f1749e = typedArray.getFloat(index, eVar4.f1749e);
                    continue;
                case 48:
                    e eVar5 = aVar.f1665f;
                    eVar5.f1750f = typedArray.getFloat(index, eVar5.f1750f);
                    continue;
                case 49:
                    e eVar6 = aVar.f1665f;
                    eVar6.f1751g = typedArray.getDimension(index, eVar6.f1751g);
                    continue;
                case 50:
                    e eVar7 = aVar.f1665f;
                    eVar7.f1752h = typedArray.getDimension(index, eVar7.f1752h);
                    continue;
                case 51:
                    e eVar8 = aVar.f1665f;
                    eVar8.f1754j = typedArray.getDimension(index, eVar8.f1754j);
                    continue;
                case 52:
                    e eVar9 = aVar.f1665f;
                    eVar9.f1755k = typedArray.getDimension(index, eVar9.f1755k);
                    continue;
                case 53:
                    e eVar10 = aVar.f1665f;
                    eVar10.f1756l = typedArray.getDimension(index, eVar10.f1756l);
                    continue;
                case 54:
                    b bVar40 = aVar.f1664e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    continue;
                case 55:
                    b bVar41 = aVar.f1664e;
                    bVar41.f1682a0 = typedArray.getInt(index, bVar41.f1682a0);
                    continue;
                case 56:
                    b bVar42 = aVar.f1664e;
                    bVar42.f1684b0 = typedArray.getDimensionPixelSize(index, bVar42.f1684b0);
                    continue;
                case 57:
                    b bVar43 = aVar.f1664e;
                    bVar43.f1686c0 = typedArray.getDimensionPixelSize(index, bVar43.f1686c0);
                    continue;
                case 58:
                    b bVar44 = aVar.f1664e;
                    bVar44.f1688d0 = typedArray.getDimensionPixelSize(index, bVar44.f1688d0);
                    continue;
                case 59:
                    b bVar45 = aVar.f1664e;
                    bVar45.f1690e0 = typedArray.getDimensionPixelSize(index, bVar45.f1690e0);
                    continue;
                case 60:
                    e eVar11 = aVar.f1665f;
                    eVar11.f1746b = typedArray.getFloat(index, eVar11.f1746b);
                    continue;
                case 61:
                    b bVar46 = aVar.f1664e;
                    bVar46.B = n(typedArray, index, bVar46.B);
                    continue;
                case 62:
                    b bVar47 = aVar.f1664e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    continue;
                case 63:
                    b bVar48 = aVar.f1664e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    continue;
                case 64:
                    c cVar3 = aVar.f1663d;
                    cVar3.f1726b = n(typedArray, index, cVar3.f1726b);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f1663d;
                        string = typedArray.getString(index);
                    } else {
                        cVar = aVar.f1663d;
                        string = s.a.f26691c[typedArray.getInteger(index, 0)];
                    }
                    cVar.f1728d = string;
                    continue;
                case 66:
                    aVar.f1663d.f1730f = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    c cVar4 = aVar.f1663d;
                    cVar4.f1733i = typedArray.getFloat(index, cVar4.f1733i);
                    continue;
                case 68:
                    C0017d c0017d4 = aVar.f1662c;
                    c0017d4.f1743e = typedArray.getFloat(index, c0017d4.f1743e);
                    continue;
                case 69:
                    aVar.f1664e.f1692f0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.f1664e.f1694g0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    b bVar49 = aVar.f1664e;
                    bVar49.f1696h0 = typedArray.getInt(index, bVar49.f1696h0);
                    continue;
                case 73:
                    b bVar50 = aVar.f1664e;
                    bVar50.f1698i0 = typedArray.getDimensionPixelSize(index, bVar50.f1698i0);
                    continue;
                case 74:
                    aVar.f1664e.f1704l0 = typedArray.getString(index);
                    continue;
                case 75:
                    b bVar51 = aVar.f1664e;
                    bVar51.f1712p0 = typedArray.getBoolean(index, bVar51.f1712p0);
                    continue;
                case 76:
                    c cVar5 = aVar.f1663d;
                    cVar5.f1729e = typedArray.getInt(index, cVar5.f1729e);
                    continue;
                case 77:
                    aVar.f1664e.f1706m0 = typedArray.getString(index);
                    continue;
                case ModuleDescriptor.MODULE_VERSION /* 78 */:
                    C0017d c0017d5 = aVar.f1662c;
                    c0017d5.f1741c = typedArray.getInt(index, c0017d5.f1741c);
                    continue;
                case 79:
                    c cVar6 = aVar.f1663d;
                    cVar6.f1731g = typedArray.getFloat(index, cVar6.f1731g);
                    continue;
                case 80:
                    b bVar52 = aVar.f1664e;
                    bVar52.f1708n0 = typedArray.getBoolean(index, bVar52.f1708n0);
                    continue;
                case 81:
                    b bVar53 = aVar.f1664e;
                    bVar53.f1710o0 = typedArray.getBoolean(index, bVar53.f1710o0);
                    continue;
                case 82:
                    c cVar7 = aVar.f1663d;
                    cVar7.f1727c = typedArray.getInteger(index, cVar7.f1727c);
                    continue;
                case 83:
                    e eVar12 = aVar.f1665f;
                    eVar12.f1753i = n(typedArray, index, eVar12.f1753i);
                    continue;
                case 84:
                    c cVar8 = aVar.f1663d;
                    cVar8.f1735k = typedArray.getInteger(index, cVar8.f1735k);
                    continue;
                case 85:
                    c cVar9 = aVar.f1663d;
                    cVar9.f1734j = typedArray.getFloat(index, cVar9.f1734j);
                    continue;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f1663d.f1738n = typedArray.getResourceId(index, -1);
                        cVar2 = aVar.f1663d;
                        if (cVar2.f1738n != -1) {
                            cVar2.f1737m = -2;
                        } else {
                            continue;
                        }
                    } else if (i11 == 3) {
                        aVar.f1663d.f1736l = typedArray.getString(index);
                        if (aVar.f1663d.f1736l.indexOf("/") > 0) {
                            aVar.f1663d.f1738n = typedArray.getResourceId(index, -1);
                            cVar2 = aVar.f1663d;
                            cVar2.f1737m = -2;
                        } else {
                            aVar.f1663d.f1737m = -1;
                        }
                    } else {
                        c cVar10 = aVar.f1663d;
                        cVar10.f1737m = typedArray.getInteger(index, cVar10.f1738n);
                    }
                case 87:
                    sb2 = new StringBuilder();
                    str = "unused attribute 0x";
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    sb2 = new StringBuilder();
                    str = "Unknown attribute 0x";
                    break;
                case 91:
                    b bVar54 = aVar.f1664e;
                    bVar54.f1716s = n(typedArray, index, bVar54.f1716s);
                    continue;
                case 92:
                    b bVar55 = aVar.f1664e;
                    bVar55.f1717t = n(typedArray, index, bVar55.f1717t);
                    continue;
                case 93:
                    b bVar56 = aVar.f1664e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    continue;
                case 94:
                    b bVar57 = aVar.f1664e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    continue;
                case 95:
                    o(aVar.f1664e, typedArray, index, 0);
                    continue;
                case 96:
                    o(aVar.f1664e, typedArray, index, 1);
                    continue;
                case 97:
                    b bVar58 = aVar.f1664e;
                    bVar58.f1714q0 = typedArray.getInt(index, bVar58.f1714q0);
                    continue;
            }
            sb2.append(str);
            sb2.append(Integer.toHexString(index));
            sb2.append("   ");
            sb2.append(f1653g.get(index));
            Log.w("ConstraintSet", sb2.toString());
        }
        b bVar59 = aVar.f1664e;
        if (bVar59.f1704l0 != null) {
            bVar59.f1702k0 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void s(android.content.Context r11, androidx.constraintlayout.widget.d.a r12, android.content.res.TypedArray r13) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.s(android.content.Context, androidx.constraintlayout.widget.d$a, android.content.res.TypedArray):void");
    }

    public void c(ConstraintLayout constraintLayout) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    void d(ConstraintLayout constraintLayout, boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1659e.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id = childAt.getId();
            if (!this.f1659e.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + w.a.a(childAt));
            } else {
                if (this.f1658d && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f1659e.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = (a) this.f1659e.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f1664e.f1700j0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(aVar.f1664e.f1696h0);
                                barrier.setMargin(aVar.f1664e.f1698i0);
                                barrier.setAllowsGoneWidget(aVar.f1664e.f1712p0);
                                b bVar = aVar.f1664e;
                                int[] iArr = bVar.f1702k0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f1704l0;
                                    if (str != null) {
                                        bVar.f1702k0 = i(barrier, str);
                                        barrier.setReferencedIds(aVar.f1664e.f1702k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.b(bVar2);
                            if (z10) {
                                androidx.constraintlayout.widget.a.c(childAt, aVar.f1666g);
                            }
                            childAt.setLayoutParams(bVar2);
                            C0017d c0017d = aVar.f1662c;
                            if (c0017d.f1741c == 0) {
                                childAt.setVisibility(c0017d.f1740b);
                            }
                            childAt.setAlpha(aVar.f1662c.f1742d);
                            childAt.setRotation(aVar.f1665f.f1746b);
                            childAt.setRotationX(aVar.f1665f.f1747c);
                            childAt.setRotationY(aVar.f1665f.f1748d);
                            childAt.setScaleX(aVar.f1665f.f1749e);
                            childAt.setScaleY(aVar.f1665f.f1750f);
                            e eVar = aVar.f1665f;
                            if (eVar.f1753i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f1665f.f1753i) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f1751g)) {
                                    childAt.setPivotX(aVar.f1665f.f1751g);
                                }
                                if (!Float.isNaN(aVar.f1665f.f1752h)) {
                                    childAt.setPivotY(aVar.f1665f.f1752h);
                                }
                            }
                            childAt.setTranslationX(aVar.f1665f.f1754j);
                            childAt.setTranslationY(aVar.f1665f.f1755k);
                            childAt.setTranslationZ(aVar.f1665f.f1756l);
                            e eVar2 = aVar.f1665f;
                            if (eVar2.f1757m) {
                                childAt.setElevation(eVar2.f1758n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = (a) this.f1659e.get(num);
            if (aVar2 != null) {
                if (aVar2.f1664e.f1700j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f1664e;
                    int[] iArr2 = bVar3.f1702k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f1704l0;
                        if (str2 != null) {
                            bVar3.f1702k0 = i(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f1664e.f1702k0);
                        }
                    }
                    barrier2.setType(aVar2.f1664e.f1696h0);
                    barrier2.setMargin(aVar2.f1664e.f1698i0);
                    ConstraintLayout.b bVarE = constraintLayout.generateDefaultLayoutParams();
                    barrier2.m();
                    aVar2.b(bVarE);
                    constraintLayout.addView(barrier2, bVarE);
                }
                if (aVar2.f1664e.f1681a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b bVarE2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.b(bVarE2);
                    constraintLayout.addView(guideline, bVarE2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).d(constraintLayout);
            }
        }
    }

    public void e(int i10, int i11) {
        a aVar;
        if (!this.f1659e.containsKey(Integer.valueOf(i10)) || (aVar = (a) this.f1659e.get(Integer.valueOf(i10))) == null) {
            return;
        }
        switch (i11) {
            case 1:
                b bVar = aVar.f1664e;
                bVar.f1701k = -1;
                bVar.f1699j = -1;
                bVar.H = -1;
                bVar.O = Integer.MIN_VALUE;
                return;
            case 2:
                b bVar2 = aVar.f1664e;
                bVar2.f1705m = -1;
                bVar2.f1703l = -1;
                bVar2.I = -1;
                bVar2.Q = Integer.MIN_VALUE;
                return;
            case 3:
                b bVar3 = aVar.f1664e;
                bVar3.f1709o = -1;
                bVar3.f1707n = -1;
                bVar3.J = 0;
                bVar3.P = Integer.MIN_VALUE;
                return;
            case 4:
                b bVar4 = aVar.f1664e;
                bVar4.f1711p = -1;
                bVar4.f1713q = -1;
                bVar4.K = 0;
                bVar4.R = Integer.MIN_VALUE;
                return;
            case 5:
                b bVar5 = aVar.f1664e;
                bVar5.f1715r = -1;
                bVar5.f1716s = -1;
                bVar5.f1717t = -1;
                bVar5.N = 0;
                bVar5.U = Integer.MIN_VALUE;
                return;
            case 6:
                b bVar6 = aVar.f1664e;
                bVar6.f1718u = -1;
                bVar6.f1719v = -1;
                bVar6.M = 0;
                bVar6.T = Integer.MIN_VALUE;
                return;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                b bVar7 = aVar.f1664e;
                bVar7.f1720w = -1;
                bVar7.f1721x = -1;
                bVar7.L = 0;
                bVar7.S = Integer.MIN_VALUE;
                return;
            case 8:
                b bVar8 = aVar.f1664e;
                bVar8.D = -1.0f;
                bVar8.C = -1;
                bVar8.B = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void f(Context context, int i10) {
        g((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1659e.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f1658d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1659e.containsKey(Integer.valueOf(id))) {
                this.f1659e.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.f1659e.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.f1666g = androidx.constraintlayout.widget.a.a(this.f1657c, childAt);
                aVar.d(id, bVar);
                aVar.f1662c.f1740b = childAt.getVisibility();
                aVar.f1662c.f1742d = childAt.getAlpha();
                aVar.f1665f.f1746b = childAt.getRotation();
                aVar.f1665f.f1747c = childAt.getRotationX();
                aVar.f1665f.f1748d = childAt.getRotationY();
                aVar.f1665f.f1749e = childAt.getScaleX();
                aVar.f1665f.f1750f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f1665f;
                    eVar.f1751g = pivotX;
                    eVar.f1752h = pivotY;
                }
                aVar.f1665f.f1754j = childAt.getTranslationX();
                aVar.f1665f.f1755k = childAt.getTranslationY();
                aVar.f1665f.f1756l = childAt.getTranslationZ();
                e eVar2 = aVar.f1665f;
                if (eVar2.f1757m) {
                    eVar2.f1758n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f1664e.f1712p0 = barrier.getAllowsGoneWidget();
                    aVar.f1664e.f1702k0 = barrier.getReferencedIds();
                    aVar.f1664e.f1696h0 = barrier.getType();
                    aVar.f1664e.f1698i0 = barrier.getMargin();
                }
            }
        }
    }

    public void h(int i10, int i11, int i12, float f5) {
        b bVar = k(i10).f1664e;
        bVar.B = i11;
        bVar.C = i12;
        bVar.D = f5;
    }

    public void l(Context context, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarJ = j(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarJ.f1664e.f1681a = true;
                    }
                    this.f1659e.put(Integer.valueOf(aVarJ.f1660a), aVarJ);
                }
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cb, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.m(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
