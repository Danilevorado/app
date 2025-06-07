package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import u.d;
import u.e;
import u.j;
import v.b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static h J;
    private int A;
    int B;
    int C;
    int D;
    int E;
    private SparseArray F;
    c G;
    private int H;
    private int I;

    /* renamed from: m, reason: collision with root package name */
    SparseArray f1536m;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList f1537n;

    /* renamed from: o, reason: collision with root package name */
    protected u.f f1538o;

    /* renamed from: p, reason: collision with root package name */
    private int f1539p;

    /* renamed from: q, reason: collision with root package name */
    private int f1540q;

    /* renamed from: r, reason: collision with root package name */
    private int f1541r;

    /* renamed from: s, reason: collision with root package name */
    private int f1542s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f1543t;

    /* renamed from: u, reason: collision with root package name */
    private int f1544u;

    /* renamed from: v, reason: collision with root package name */
    private d f1545v;

    /* renamed from: w, reason: collision with root package name */
    protected androidx.constraintlayout.widget.c f1546w;

    /* renamed from: x, reason: collision with root package name */
    private int f1547x;

    /* renamed from: y, reason: collision with root package name */
    private HashMap f1548y;

    /* renamed from: z, reason: collision with root package name */
    private int f1549z;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1550a;

        static {
            int[] iArr = new int[e.b.values().length];
            f1550a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1550a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1550a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1550a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        boolean E;
        boolean F;
        public float G;
        public float H;
        public String I;
        float J;
        int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;

        /* renamed from: a, reason: collision with root package name */
        public int f1551a;

        /* renamed from: a0, reason: collision with root package name */
        public boolean f1552a0;

        /* renamed from: b, reason: collision with root package name */
        public int f1553b;

        /* renamed from: b0, reason: collision with root package name */
        public boolean f1554b0;

        /* renamed from: c, reason: collision with root package name */
        public float f1555c;

        /* renamed from: c0, reason: collision with root package name */
        public String f1556c0;

        /* renamed from: d, reason: collision with root package name */
        public boolean f1557d;

        /* renamed from: d0, reason: collision with root package name */
        public int f1558d0;

        /* renamed from: e, reason: collision with root package name */
        public int f1559e;

        /* renamed from: e0, reason: collision with root package name */
        boolean f1560e0;

        /* renamed from: f, reason: collision with root package name */
        public int f1561f;

        /* renamed from: f0, reason: collision with root package name */
        boolean f1562f0;

        /* renamed from: g, reason: collision with root package name */
        public int f1563g;

        /* renamed from: g0, reason: collision with root package name */
        boolean f1564g0;

        /* renamed from: h, reason: collision with root package name */
        public int f1565h;

        /* renamed from: h0, reason: collision with root package name */
        boolean f1566h0;

        /* renamed from: i, reason: collision with root package name */
        public int f1567i;

        /* renamed from: i0, reason: collision with root package name */
        boolean f1568i0;

        /* renamed from: j, reason: collision with root package name */
        public int f1569j;

        /* renamed from: j0, reason: collision with root package name */
        boolean f1570j0;

        /* renamed from: k, reason: collision with root package name */
        public int f1571k;

        /* renamed from: k0, reason: collision with root package name */
        boolean f1572k0;

        /* renamed from: l, reason: collision with root package name */
        public int f1573l;

        /* renamed from: l0, reason: collision with root package name */
        int f1574l0;

        /* renamed from: m, reason: collision with root package name */
        public int f1575m;

        /* renamed from: m0, reason: collision with root package name */
        int f1576m0;

        /* renamed from: n, reason: collision with root package name */
        public int f1577n;

        /* renamed from: n0, reason: collision with root package name */
        int f1578n0;

        /* renamed from: o, reason: collision with root package name */
        public int f1579o;

        /* renamed from: o0, reason: collision with root package name */
        int f1580o0;

        /* renamed from: p, reason: collision with root package name */
        public int f1581p;

        /* renamed from: p0, reason: collision with root package name */
        int f1582p0;

        /* renamed from: q, reason: collision with root package name */
        public int f1583q;

        /* renamed from: q0, reason: collision with root package name */
        int f1584q0;

        /* renamed from: r, reason: collision with root package name */
        public float f1585r;

        /* renamed from: r0, reason: collision with root package name */
        float f1586r0;

        /* renamed from: s, reason: collision with root package name */
        public int f1587s;

        /* renamed from: s0, reason: collision with root package name */
        int f1588s0;

        /* renamed from: t, reason: collision with root package name */
        public int f1589t;

        /* renamed from: t0, reason: collision with root package name */
        int f1590t0;

        /* renamed from: u, reason: collision with root package name */
        public int f1591u;

        /* renamed from: u0, reason: collision with root package name */
        float f1592u0;

        /* renamed from: v, reason: collision with root package name */
        public int f1593v;

        /* renamed from: v0, reason: collision with root package name */
        u.e f1594v0;

        /* renamed from: w, reason: collision with root package name */
        public int f1595w;

        /* renamed from: w0, reason: collision with root package name */
        public boolean f1596w0;

        /* renamed from: x, reason: collision with root package name */
        public int f1597x;

        /* renamed from: y, reason: collision with root package name */
        public int f1598y;

        /* renamed from: z, reason: collision with root package name */
        public int f1599z;

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f1600a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1600a = sparseIntArray;
                sparseIntArray.append(g.f1900q2, 64);
                sparseIntArray.append(g.T1, 65);
                sparseIntArray.append(g.f1780c2, 8);
                sparseIntArray.append(g.f1789d2, 9);
                sparseIntArray.append(g.f1806f2, 10);
                sparseIntArray.append(g.f1814g2, 11);
                sparseIntArray.append(g.f1868m2, 12);
                sparseIntArray.append(g.f1859l2, 13);
                sparseIntArray.append(g.J1, 14);
                sparseIntArray.append(g.I1, 15);
                sparseIntArray.append(g.E1, 16);
                sparseIntArray.append(g.G1, 52);
                sparseIntArray.append(g.F1, 53);
                sparseIntArray.append(g.K1, 2);
                sparseIntArray.append(g.M1, 3);
                sparseIntArray.append(g.L1, 4);
                sparseIntArray.append(g.f1940v2, 49);
                sparseIntArray.append(g.f1948w2, 50);
                sparseIntArray.append(g.Q1, 5);
                sparseIntArray.append(g.R1, 6);
                sparseIntArray.append(g.S1, 7);
                sparseIntArray.append(g.f1971z1, 67);
                sparseIntArray.append(g.f1883o1, 1);
                sparseIntArray.append(g.f1823h2, 17);
                sparseIntArray.append(g.f1832i2, 18);
                sparseIntArray.append(g.P1, 19);
                sparseIntArray.append(g.O1, 20);
                sparseIntArray.append(g.A2, 21);
                sparseIntArray.append(g.D2, 22);
                sparseIntArray.append(g.B2, 23);
                sparseIntArray.append(g.f1964y2, 24);
                sparseIntArray.append(g.C2, 25);
                sparseIntArray.append(g.f1972z2, 26);
                sparseIntArray.append(g.f1956x2, 55);
                sparseIntArray.append(g.E2, 54);
                sparseIntArray.append(g.Y1, 29);
                sparseIntArray.append(g.f1877n2, 30);
                sparseIntArray.append(g.N1, 44);
                sparseIntArray.append(g.f1762a2, 45);
                sparseIntArray.append(g.f1892p2, 46);
                sparseIntArray.append(g.Z1, 47);
                sparseIntArray.append(g.f1884o2, 48);
                sparseIntArray.append(g.C1, 27);
                sparseIntArray.append(g.B1, 28);
                sparseIntArray.append(g.f1908r2, 31);
                sparseIntArray.append(g.U1, 32);
                sparseIntArray.append(g.f1924t2, 33);
                sparseIntArray.append(g.f1916s2, 34);
                sparseIntArray.append(g.f1932u2, 35);
                sparseIntArray.append(g.W1, 36);
                sparseIntArray.append(g.V1, 37);
                sparseIntArray.append(g.X1, 38);
                sparseIntArray.append(g.f1771b2, 39);
                sparseIntArray.append(g.f1850k2, 40);
                sparseIntArray.append(g.f1798e2, 41);
                sparseIntArray.append(g.H1, 42);
                sparseIntArray.append(g.D1, 43);
                sparseIntArray.append(g.f1841j2, 51);
                sparseIntArray.append(g.G2, 66);
            }
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f1551a = -1;
            this.f1553b = -1;
            this.f1555c = -1.0f;
            this.f1557d = true;
            this.f1559e = -1;
            this.f1561f = -1;
            this.f1563g = -1;
            this.f1565h = -1;
            this.f1567i = -1;
            this.f1569j = -1;
            this.f1571k = -1;
            this.f1573l = -1;
            this.f1575m = -1;
            this.f1577n = -1;
            this.f1579o = -1;
            this.f1581p = -1;
            this.f1583q = 0;
            this.f1585r = 0.0f;
            this.f1587s = -1;
            this.f1589t = -1;
            this.f1591u = -1;
            this.f1593v = -1;
            this.f1595w = Integer.MIN_VALUE;
            this.f1597x = Integer.MIN_VALUE;
            this.f1598y = Integer.MIN_VALUE;
            this.f1599z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1552a0 = false;
            this.f1554b0 = false;
            this.f1556c0 = null;
            this.f1558d0 = 0;
            this.f1560e0 = true;
            this.f1562f0 = true;
            this.f1564g0 = false;
            this.f1566h0 = false;
            this.f1568i0 = false;
            this.f1570j0 = false;
            this.f1572k0 = false;
            this.f1574l0 = -1;
            this.f1576m0 = -1;
            this.f1578n0 = -1;
            this.f1580o0 = -1;
            this.f1582p0 = Integer.MIN_VALUE;
            this.f1584q0 = Integer.MIN_VALUE;
            this.f1586r0 = 0.5f;
            this.f1594v0 = new u.e();
            this.f1596w0 = false;
        }

        public b(Context context, AttributeSet attributeSet) throws NumberFormatException {
            String str;
            super(context, attributeSet);
            this.f1551a = -1;
            this.f1553b = -1;
            this.f1555c = -1.0f;
            this.f1557d = true;
            this.f1559e = -1;
            this.f1561f = -1;
            this.f1563g = -1;
            this.f1565h = -1;
            this.f1567i = -1;
            this.f1569j = -1;
            this.f1571k = -1;
            this.f1573l = -1;
            this.f1575m = -1;
            this.f1577n = -1;
            this.f1579o = -1;
            this.f1581p = -1;
            this.f1583q = 0;
            this.f1585r = 0.0f;
            this.f1587s = -1;
            this.f1589t = -1;
            this.f1591u = -1;
            this.f1593v = -1;
            this.f1595w = Integer.MIN_VALUE;
            this.f1597x = Integer.MIN_VALUE;
            this.f1598y = Integer.MIN_VALUE;
            this.f1599z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1552a0 = false;
            this.f1554b0 = false;
            this.f1556c0 = null;
            this.f1558d0 = 0;
            this.f1560e0 = true;
            this.f1562f0 = true;
            this.f1564g0 = false;
            this.f1566h0 = false;
            this.f1568i0 = false;
            this.f1570j0 = false;
            this.f1572k0 = false;
            this.f1574l0 = -1;
            this.f1576m0 = -1;
            this.f1578n0 = -1;
            this.f1580o0 = -1;
            this.f1582p0 = Integer.MIN_VALUE;
            this.f1584q0 = Integer.MIN_VALUE;
            this.f1586r0 = 0.5f;
            this.f1594v0 = new u.e();
            this.f1596w0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f1876n1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = a.f1600a.get(index);
                switch (i11) {
                    case 1:
                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                        continue;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1581p);
                        this.f1581p = resourceId;
                        if (resourceId == -1) {
                            this.f1581p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.f1583q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1583q);
                        continue;
                    case 4:
                        float f5 = typedArrayObtainStyledAttributes.getFloat(index, this.f1585r) % 360.0f;
                        this.f1585r = f5;
                        if (f5 < 0.0f) {
                            this.f1585r = (360.0f - f5) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f1551a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1551a);
                        continue;
                    case 6:
                        this.f1553b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1553b);
                        continue;
                    case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                        this.f1555c = typedArrayObtainStyledAttributes.getFloat(index, this.f1555c);
                        continue;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1559e);
                        this.f1559e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1559e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1561f);
                        this.f1561f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1561f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1563g);
                        this.f1563g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1563g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1565h);
                        this.f1565h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1565h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1567i);
                        this.f1567i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1567i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1569j);
                        this.f1569j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1569j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1571k);
                        this.f1571k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1571k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1573l);
                        this.f1573l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1573l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1575m);
                        this.f1575m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1575m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1587s);
                        this.f1587s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1587s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1589t);
                        this.f1589t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1589t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1591u);
                        this.f1591u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1591u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1593v);
                        this.f1593v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1593v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.f1595w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1595w);
                        continue;
                    case 22:
                        this.f1597x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1597x);
                        continue;
                    case 23:
                        this.f1598y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1598y);
                        continue;
                    case 24:
                        this.f1599z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1599z);
                        continue;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        continue;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        continue;
                    case 27:
                        this.f1552a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1552a0);
                        continue;
                    case 28:
                        this.f1554b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1554b0);
                        continue;
                    case 29:
                        this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G);
                        continue;
                    case 30:
                        this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                        continue;
                    case 31:
                        int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.P = i12;
                        if (i12 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        }
                    case 32:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.Q = i13;
                        if (i13 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        }
                    case 33:
                        try {
                            this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            continue;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                            }
                        }
                    case 34:
                        try {
                            this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                            continue;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                            }
                        }
                    case 35:
                        this.V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        continue;
                    case 36:
                        try {
                            this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            continue;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                            }
                        }
                    case 37:
                        try {
                            this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                            continue;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                            }
                        }
                    case 38:
                        this.W = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        continue;
                    default:
                        switch (i11) {
                            case 44:
                                d.q(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 46:
                                this.M = typedArrayObtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case 47:
                                this.N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 50:
                                this.Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case 51:
                                this.f1556c0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1577n);
                                this.f1577n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f1577n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1579o);
                                this.f1579o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f1579o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        d.o(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        d.o(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.f1558d0 = typedArrayObtainStyledAttributes.getInt(index, this.f1558d0);
                                        break;
                                    case 67:
                                        this.f1557d = typedArrayObtainStyledAttributes.getBoolean(index, this.f1557d);
                                        continue;
                                }
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1551a = -1;
            this.f1553b = -1;
            this.f1555c = -1.0f;
            this.f1557d = true;
            this.f1559e = -1;
            this.f1561f = -1;
            this.f1563g = -1;
            this.f1565h = -1;
            this.f1567i = -1;
            this.f1569j = -1;
            this.f1571k = -1;
            this.f1573l = -1;
            this.f1575m = -1;
            this.f1577n = -1;
            this.f1579o = -1;
            this.f1581p = -1;
            this.f1583q = 0;
            this.f1585r = 0.0f;
            this.f1587s = -1;
            this.f1589t = -1;
            this.f1591u = -1;
            this.f1593v = -1;
            this.f1595w = Integer.MIN_VALUE;
            this.f1597x = Integer.MIN_VALUE;
            this.f1598y = Integer.MIN_VALUE;
            this.f1599z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1552a0 = false;
            this.f1554b0 = false;
            this.f1556c0 = null;
            this.f1558d0 = 0;
            this.f1560e0 = true;
            this.f1562f0 = true;
            this.f1564g0 = false;
            this.f1566h0 = false;
            this.f1568i0 = false;
            this.f1570j0 = false;
            this.f1572k0 = false;
            this.f1574l0 = -1;
            this.f1576m0 = -1;
            this.f1578n0 = -1;
            this.f1580o0 = -1;
            this.f1582p0 = Integer.MIN_VALUE;
            this.f1584q0 = Integer.MIN_VALUE;
            this.f1586r0 = 0.5f;
            this.f1594v0 = new u.e();
            this.f1596w0 = false;
        }

        public void a() {
            this.f1566h0 = false;
            this.f1560e0 = true;
            this.f1562f0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f1552a0) {
                this.f1560e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f1554b0) {
                this.f1562f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f1560e0 = false;
                if (i10 == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f1552a0 = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f1562f0 = false;
                if (i11 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f1554b0 = true;
                }
            }
            if (this.f1555c == -1.0f && this.f1551a == -1 && this.f1553b == -1) {
                return;
            }
            this.f1566h0 = true;
            this.f1560e0 = true;
            this.f1562f0 = true;
            if (!(this.f1594v0 instanceof u.g)) {
                this.f1594v0 = new u.g();
            }
            ((u.g) this.f1594v0).w1(this.Z);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 255
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }
    }

    class c implements b.InterfaceC0195b {

        /* renamed from: a, reason: collision with root package name */
        ConstraintLayout f1601a;

        /* renamed from: b, reason: collision with root package name */
        int f1602b;

        /* renamed from: c, reason: collision with root package name */
        int f1603c;

        /* renamed from: d, reason: collision with root package name */
        int f1604d;

        /* renamed from: e, reason: collision with root package name */
        int f1605e;

        /* renamed from: f, reason: collision with root package name */
        int f1606f;

        /* renamed from: g, reason: collision with root package name */
        int f1607g;

        public c(ConstraintLayout constraintLayout) {
            this.f1601a = constraintLayout;
        }

        private boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }

        @Override // v.b.InterfaceC0195b
        public final void a() {
            int childCount = this.f1601a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f1601a.getChildAt(i10);
            }
            int size = this.f1601a.f1537n.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.b) this.f1601a.f1537n.get(i11)).j(this.f1601a);
                }
            }
        }

        @Override // v.b.InterfaceC0195b
        public final void b(u.e eVar, b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int i10;
            int measuredHeight;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            if (eVar == null) {
                return;
            }
            if (eVar.T() == 8 && !eVar.h0()) {
                aVar.f27694e = 0;
                aVar.f27695f = 0;
                aVar.f27696g = 0;
                return;
            }
            if (eVar.I() == null) {
                return;
            }
            e.b bVar = aVar.f27690a;
            e.b bVar2 = aVar.f27691b;
            int iU = aVar.f27692c;
            int iV = aVar.f27693d;
            int iS = this.f1602b + this.f1603c;
            int iZ = this.f1604d;
            View view = (View) eVar.q();
            int[] iArr = a.f1550a;
            int i16 = iArr[bVar.ordinal()];
            if (i16 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iU, 1073741824);
            } else {
                if (i16 == 2) {
                    i14 = this.f1606f;
                    i15 = -2;
                } else if (i16 == 3) {
                    i14 = this.f1606f;
                    iZ += eVar.z();
                    i15 = -1;
                } else if (i16 != 4) {
                    iMakeMeasureSpec = 0;
                } else {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1606f, iZ, -2);
                    boolean z10 = eVar.f27492w == 1;
                    int i17 = aVar.f27699j;
                    if (i17 == b.a.f27688l || i17 == b.a.f27689m) {
                        if (aVar.f27699j == b.a.f27689m || !z10 || (z10 && (view.getMeasuredHeight() == eVar.v())) || eVar.l0()) {
                            iU = eVar.U();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iU, 1073741824);
                        }
                    }
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i14, iZ, i15);
            }
            int i18 = iArr[bVar2.ordinal()];
            if (i18 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iV, 1073741824);
            } else {
                if (i18 == 2) {
                    i12 = this.f1607g;
                    i13 = -2;
                } else if (i18 == 3) {
                    i12 = this.f1607g;
                    iS += eVar.S();
                    i13 = -1;
                } else if (i18 != 4) {
                    iMakeMeasureSpec2 = 0;
                } else {
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1607g, iS, -2);
                    boolean z11 = eVar.f27494x == 1;
                    int i19 = aVar.f27699j;
                    if (i19 == b.a.f27688l || i19 == b.a.f27689m) {
                        if (aVar.f27699j == b.a.f27689m || !z11 || (z11 && (view.getMeasuredWidth() == eVar.U())) || eVar.m0()) {
                            iV = eVar.v();
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iV, 1073741824);
                        }
                    }
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, iS, i13);
            }
            u.f fVar = (u.f) eVar.I();
            if (fVar != null && j.b(ConstraintLayout.this.f1544u, 256) && view.getMeasuredWidth() == eVar.U() && view.getMeasuredWidth() < fVar.U() && view.getMeasuredHeight() == eVar.v() && view.getMeasuredHeight() < fVar.v() && view.getBaseline() == eVar.n() && !eVar.k0()) {
                if (d(eVar.A(), iMakeMeasureSpec, eVar.U()) && d(eVar.B(), iMakeMeasureSpec2, eVar.v())) {
                    aVar.f27694e = eVar.U();
                    aVar.f27695f = eVar.v();
                    aVar.f27696g = eVar.n();
                    return;
                }
            }
            e.b bVar3 = e.b.MATCH_CONSTRAINT;
            boolean z12 = bVar == bVar3;
            boolean z13 = bVar2 == bVar3;
            e.b bVar4 = e.b.MATCH_PARENT;
            boolean z14 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
            boolean z15 = bVar == bVar4 || bVar == e.b.FIXED;
            boolean z16 = z12 && eVar.f27455d0 > 0.0f;
            boolean z17 = z13 && eVar.f27455d0 > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i20 = aVar.f27699j;
            if (i20 != b.a.f27688l && i20 != b.a.f27689m && z12 && eVar.f27492w == 0 && z13 && eVar.f27494x == 0) {
                i11 = -1;
                measuredHeight = 0;
                baseline = 0;
                iMax = 0;
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                eVar.R0(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i21 = eVar.f27498z;
                iMax = i21 > 0 ? Math.max(i21, measuredWidth) : measuredWidth;
                int i22 = eVar.A;
                if (i22 > 0) {
                    iMax = Math.min(i22, iMax);
                }
                int i23 = eVar.C;
                if (i23 > 0) {
                    measuredHeight = Math.max(i23, measuredHeight2);
                    i10 = iMakeMeasureSpec;
                } else {
                    i10 = iMakeMeasureSpec;
                    measuredHeight = measuredHeight2;
                }
                int i24 = eVar.D;
                if (i24 > 0) {
                    measuredHeight = Math.min(i24, measuredHeight);
                }
                if (!j.b(ConstraintLayout.this.f1544u, 1)) {
                    if (z16 && z14) {
                        iMax = (int) ((measuredHeight * eVar.f27455d0) + 0.5f);
                    } else if (z17 && z15) {
                        measuredHeight = (int) ((iMax / eVar.f27455d0) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight2 != measuredHeight) {
                    int iMakeMeasureSpec3 = measuredWidth != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i10;
                    if (measuredHeight2 != measuredHeight) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    eVar.R0(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i11 = -1;
            }
            boolean z18 = baseline != i11;
            aVar.f27698i = (iMax == aVar.f27692c && measuredHeight == aVar.f27693d) ? false : true;
            if (bVar5.f1564g0) {
                z18 = true;
            }
            if (z18 && baseline != -1 && eVar.n() != baseline) {
                aVar.f27698i = true;
            }
            aVar.f27694e = iMax;
            aVar.f27695f = measuredHeight;
            aVar.f27697h = z18;
            aVar.f27696g = baseline;
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f1602b = i12;
            this.f1603c = i13;
            this.f1604d = i14;
            this.f1605e = i15;
            this.f1606f = i10;
            this.f1607g = i11;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        this.f1536m = new SparseArray();
        this.f1537n = new ArrayList(4);
        this.f1538o = new u.f();
        this.f1539p = 0;
        this.f1540q = 0;
        this.f1541r = Integer.MAX_VALUE;
        this.f1542s = Integer.MAX_VALUE;
        this.f1543t = true;
        this.f1544u = 257;
        this.f1545v = null;
        this.f1546w = null;
        this.f1547x = -1;
        this.f1548y = new HashMap();
        this.f1549z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = 0;
        this.E = 0;
        this.F = new SparseArray();
        this.G = new c(this);
        this.H = 0;
        this.I = 0;
        q(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i10);
        this.f1536m = new SparseArray();
        this.f1537n = new ArrayList(4);
        this.f1538o = new u.f();
        this.f1539p = 0;
        this.f1540q = 0;
        this.f1541r = Integer.MAX_VALUE;
        this.f1542s = Integer.MAX_VALUE;
        this.f1543t = true;
        this.f1544u = 257;
        this.f1545v = null;
        this.f1546w = null;
        this.f1547x = -1;
        this.f1548y = new HashMap();
        this.f1549z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = 0;
        this.E = 0;
        this.F = new SparseArray();
        this.G = new c(this);
        this.H = 0;
        this.I = 0;
        q(attributeSet, i10, 0);
    }

    private boolean A() throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            w();
        }
        return z10;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static h getSharedValues() {
        if (J == null) {
            J = new h();
        }
        return J;
    }

    private final u.e k(int i10) {
        if (i10 == 0) {
            return this.f1538o;
        }
        View viewFindViewById = (View) this.f1536m.get(i10);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i10)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f1538o;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f1594v0;
    }

    private void q(AttributeSet attributeSet, int i10, int i11) throws XmlPullParserException, IOException, NumberFormatException {
        this.f1538o.y0(this);
        this.f1538o.Q1(this.G);
        this.f1536m.put(getId(), this);
        this.f1545v = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f1876n1, i10, i11);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == g.f1907r1) {
                    this.f1539p = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1539p);
                } else if (index == g.f1915s1) {
                    this.f1540q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1540q);
                } else if (index == g.f1891p1) {
                    this.f1541r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1541r);
                } else if (index == g.f1899q1) {
                    this.f1542s = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1542s);
                } else if (index == g.F2) {
                    this.f1544u = typedArrayObtainStyledAttributes.getInt(index, this.f1544u);
                } else if (index == g.A1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            t(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1546w = null;
                        }
                    }
                } else if (index == g.f1947w1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.f1545v = dVar;
                        dVar.l(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1545v = null;
                    }
                    this.f1547x = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1538o.R1(this.f1544u);
    }

    private void s() {
        this.f1543t = true;
        this.f1549z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = 0;
        this.E = 0;
    }

    private void w() throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            u.e eVarP = p(getChildAt(i10));
            if (eVarP != null) {
                eVarP.r0();
            }
        }
        if (zIsInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    x(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    k(childAt.getId()).z0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f1547x != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                getChildAt(i12).getId();
                int i13 = this.f1547x;
            }
        }
        d dVar = this.f1545v;
        if (dVar != null) {
            dVar.d(this, true);
        }
        this.f1538o.q1();
        int size = this.f1537n.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                ((androidx.constraintlayout.widget.b) this.f1537n.get(i14)).l(this);
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            getChildAt(i15);
        }
        this.F.clear();
        this.F.put(0, this.f1538o);
        this.F.put(getId(), this.f1538o);
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            this.F.put(childAt2.getId(), p(childAt2));
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt3 = getChildAt(i17);
            u.e eVarP2 = p(childAt3);
            if (eVarP2 != null) {
                b bVar = (b) childAt3.getLayoutParams();
                this.f1538o.a(eVarP2);
                d(zIsInEditMode, childAt3, eVarP2, bVar, this.F);
            }
        }
    }

    private void z(u.e eVar, b bVar, SparseArray sparseArray, int i10, d.b bVar2) {
        View view = (View) this.f1536m.get(i10);
        u.e eVar2 = (u.e) sparseArray.get(i10);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f1564g0 = true;
        d.b bVar3 = d.b.BASELINE;
        if (bVar2 == bVar3) {
            b bVar4 = (b) view.getLayoutParams();
            bVar4.f1564g0 = true;
            bVar4.f1594v0.H0(true);
        }
        eVar.m(bVar3).a(eVar2.m(bVar2), bVar.D, bVar.C, true);
        eVar.H0(true);
        eVar.m(d.b.TOP).p();
        eVar.m(d.b.BOTTOM).p();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void d(boolean r17, android.view.View r18, u.e r19, androidx.constraintlayout.widget.ConstraintLayout.b r20, android.util.SparseArray r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.d(boolean, android.view.View, u.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.f1537n;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.constraintlayout.widget.b) this.f1537n.get(i10)).k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f5 = i15;
                        float f10 = i16;
                        float f11 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f5, f10, f11, f10, paint);
                        float f12 = i16 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f11, f10, f11, f12, paint);
                        canvas.drawLine(f11, f12, f5, f12, paint);
                        canvas.drawLine(f5, f12, f5, f10, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f5, f10, f11, f12, paint);
                        canvas.drawLine(f5, f12, f11, f10, paint);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void forceLayout() {
        s();
        super.forceLayout();
    }

    public Object g(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.f1548y;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f1548y.get(str);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getMaxHeight() {
        return this.f1542s;
    }

    public int getMaxWidth() {
        return this.f1541r;
    }

    public int getMinHeight() {
        return this.f1540q;
    }

    public int getMinWidth() {
        return this.f1539p;
    }

    public int getOptimizationLevel() {
        return this.f1538o.F1();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb2 = new StringBuilder();
        if (this.f1538o.f27476o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.f1538o.f27476o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.f1538o.f27476o = "parent";
            }
        }
        if (this.f1538o.r() == null) {
            u.f fVar = this.f1538o;
            fVar.z0(fVar.f27476o);
            Log.v("ConstraintLayout", " setDebugName " + this.f1538o.r());
        }
        Iterator it = this.f1538o.n1().iterator();
        while (it.hasNext()) {
            u.e eVar = (u.e) it.next();
            View view = (View) eVar.q();
            if (view != null) {
                if (eVar.f27476o == null && (id = view.getId()) != -1) {
                    eVar.f27476o = getContext().getResources().getResourceEntryName(id);
                }
                if (eVar.r() == null) {
                    eVar.z0(eVar.f27476o);
                    Log.v("ConstraintLayout", " setDebugName " + eVar.r());
                }
            }
        }
        this.f1538o.M(sb2);
        return sb2.toString();
    }

    public View l(int i10) {
        return (View) this.f1536m.get(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            u.e eVar = bVar.f1594v0;
            if ((childAt.getVisibility() != 8 || bVar.f1566h0 || bVar.f1568i0 || bVar.f1572k0 || zIsInEditMode) && !bVar.f1570j0) {
                int iV = eVar.V();
                int iW = eVar.W();
                childAt.layout(iV, iW, eVar.U() + iV, eVar.v() + iW);
            }
        }
        int size = this.f1537n.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((androidx.constraintlayout.widget.b) this.f1537n.get(i15)).i(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.H == i10) {
            int i12 = this.I;
        }
        if (!this.f1543t) {
            int childCount = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                if (getChildAt(i13).isLayoutRequested()) {
                    this.f1543t = true;
                    break;
                }
                i13++;
            }
        }
        boolean z10 = this.f1543t;
        this.H = i10;
        this.I = i11;
        this.f1538o.T1(r());
        if (this.f1543t) {
            this.f1543t = false;
            if (A()) {
                this.f1538o.V1();
            }
        }
        v(this.f1538o, this.f1544u, i10, i11);
        u(i10, i11, this.f1538o.U(), this.f1538o.v(), this.f1538o.L1(), this.f1538o.J1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        u.e eVarP = p(view);
        if ((view instanceof Guideline) && !(eVarP instanceof u.g)) {
            b bVar = (b) view.getLayoutParams();
            u.g gVar = new u.g();
            bVar.f1594v0 = gVar;
            bVar.f1566h0 = true;
            gVar.w1(bVar.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.m();
            ((b) view.getLayoutParams()).f1568i0 = true;
            if (!this.f1537n.contains(bVar2)) {
                this.f1537n.add(bVar2);
            }
        }
        this.f1536m.put(view.getId(), view);
        this.f1543t = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1536m.remove(view.getId());
        this.f1538o.p1(p(view));
        this.f1537n.remove(view);
        this.f1543t = true;
    }

    public final u.e p(View view) {
        if (view == this) {
            return this.f1538o;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof b)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof b)) {
                return null;
            }
        }
        return ((b) view.getLayoutParams()).f1594v0;
    }

    protected boolean r() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        s();
        super.requestLayout();
    }

    public void setConstraintSet(d dVar) {
        this.f1545v = dVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f1536m.remove(getId());
        super.setId(i10);
        this.f1536m.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f1542s) {
            return;
        }
        this.f1542s = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f1541r) {
            return;
        }
        this.f1541r = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f1540q) {
            return;
        }
        this.f1540q = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f1539p) {
            return;
        }
        this.f1539p = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(e eVar) {
        androidx.constraintlayout.widget.c cVar = this.f1546w;
        if (cVar != null) {
            cVar.c(eVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f1544u = i10;
        this.f1538o.R1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected void t(int i10) {
        this.f1546w = new androidx.constraintlayout.widget.c(getContext(), this, i10);
    }

    protected void u(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.G;
        int i14 = cVar.f1605e;
        int iResolveSizeAndState = ViewGroup.resolveSizeAndState(i12 + cVar.f1604d, i10, 0);
        int iResolveSizeAndState2 = ViewGroup.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.f1541r, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f1542s, iResolveSizeAndState2);
        if (z10) {
            iMin |= 16777216;
        }
        if (z11) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f1549z = iMin;
        this.A = iMin2;
    }

    protected void v(u.f fVar, int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i13 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.G.c(i11, i12, iMax, iMax2, paddingWidth, i13);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        int iMax5 = (iMax3 > 0 || iMax4 > 0) ? r() ? iMax4 : iMax3 : Math.max(0, getPaddingLeft());
        int i14 = size - paddingWidth;
        int i15 = size2 - i13;
        y(fVar, mode, i14, mode2, i15);
        fVar.M1(i10, mode, i14, mode2, i15, this.f1549z, this.A, iMax5, iMax);
    }

    public void x(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1548y == null) {
                this.f1548y = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f1548y.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[PHI: r9
  0x002c: PHI (r9v2 u.e$b) = (r9v1 u.e$b), (r9v8 u.e$b) binds: [B:13:0x002a, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b A[PHI: r2
  0x004b: PHI (r2v2 u.e$b) = (r2v1 u.e$b), (r2v4 u.e$b) binds: [B:24:0x0049, B:21:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void y(u.f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.G
            int r1 = r0.f1605e
            int r0 = r0.f1604d
            u.e$b r2 = u.e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L28
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r6
            goto L32
        L1a:
            int r9 = r7.f1541r
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L32
        L23:
            u.e$b r9 = u.e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            goto L2c
        L28:
            u.e$b r9 = u.e.b.WRAP_CONTENT
            if (r3 != 0) goto L32
        L2c:
            int r10 = r7.f1539p
            int r10 = java.lang.Math.max(r6, r10)
        L32:
            if (r11 == r5) goto L47
            if (r11 == 0) goto L42
            if (r11 == r4) goto L3a
        L38:
            r12 = r6
            goto L51
        L3a:
            int r11 = r7.f1542s
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L51
        L42:
            u.e$b r2 = u.e.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            goto L4b
        L47:
            u.e$b r2 = u.e.b.WRAP_CONTENT
            if (r3 != 0) goto L51
        L4b:
            int r11 = r7.f1540q
            int r12 = java.lang.Math.max(r6, r11)
        L51:
            int r11 = r8.U()
            if (r10 != r11) goto L5d
            int r11 = r8.v()
            if (r12 == r11) goto L60
        L5d:
            r8.I1()
        L60:
            r8.i1(r6)
            r8.j1(r6)
            int r11 = r7.f1541r
            int r11 = r11 - r0
            r8.T0(r11)
            int r11 = r7.f1542s
            int r11 = r11 - r1
            r8.S0(r11)
            r8.W0(r6)
            r8.V0(r6)
            r8.M0(r9)
            r8.g1(r10)
            r8.c1(r2)
            r8.I0(r12)
            int r9 = r7.f1539p
            int r9 = r9 - r0
            r8.W0(r9)
            int r9 = r7.f1540q
            int r9 = r9 - r1
            r8.V0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.y(u.f, int, int, int, int):void");
    }
}
