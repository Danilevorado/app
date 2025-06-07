package com.onesignal;

import com.facebook.ads.internal.api.AdSizeApi;
import com.onesignal.e3;
import com.onesignal.u0;
import com.onesignal.z2;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
class a3 {

    /* renamed from: a, reason: collision with root package name */
    u0 f21694a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f21695b = new ConcurrentHashMap();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21696a;

        static {
            int[] iArr = new int[z2.b.values().length];
            f21696a = iArr;
            try {
                iArr[z2.b.EQUAL_TO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21696a[z2.b.NOT_EQUAL_TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21696a[z2.b.EXISTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21696a[z2.b.CONTAINS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21696a[z2.b.NOT_EXISTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21696a[z2.b.LESS_THAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21696a[z2.b.GREATER_THAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21696a[z2.b.LESS_THAN_OR_EQUAL_TO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21696a[z2.b.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    a3(u0.c cVar) {
        this.f21694a = new u0(cVar);
    }

    private boolean b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!d((z2) it.next())) {
                return false;
            }
        }
        return true;
    }

    private boolean d(z2 z2Var) {
        z2.a aVar = z2Var.f22542b;
        if (aVar == z2.a.UNKNOWN) {
            return false;
        }
        if (aVar != z2.a.CUSTOM) {
            return this.f21694a.c(z2Var);
        }
        z2.b bVar = z2Var.f22544d;
        Object obj = this.f21695b.get(z2Var.f22543c);
        if (obj == null) {
            if (bVar == z2.b.NOT_EXISTS) {
                return true;
            }
            return bVar == z2.b.NOT_EQUAL_TO && z2Var.f22545e != null;
        }
        if (bVar == z2.b.EXISTS) {
            return true;
        }
        if (bVar == z2.b.NOT_EXISTS) {
            return false;
        }
        if (bVar == z2.b.CONTAINS) {
            return (obj instanceof Collection) && ((Collection) obj).contains(z2Var.f22545e);
        }
        if (obj instanceof String) {
            Object obj2 = z2Var.f22545e;
            if ((obj2 instanceof String) && j((String) obj2, (String) obj, bVar)) {
                return true;
            }
        }
        Object obj3 = z2Var.f22545e;
        return ((obj3 instanceof Number) && (obj instanceof Number) && h((Number) obj3, (Number) obj, bVar)) || g(z2Var.f22545e, obj, bVar);
    }

    private boolean g(Object obj, Object obj2, z2.b bVar) {
        if (obj == null) {
            return false;
        }
        if (!bVar.b()) {
            if ((obj2 instanceof String) && (obj instanceof Number)) {
                return i((Number) obj, (String) obj2, bVar);
            }
            return false;
        }
        String string = obj.toString();
        String string2 = obj2.toString();
        if (obj2 instanceof Number) {
            string2 = new DecimalFormat("0.#").format(obj2);
        }
        return j(string, string2, bVar);
    }

    private boolean h(Number number, Number number2, z2.b bVar) {
        double dDoubleValue = number.doubleValue();
        double dDoubleValue2 = number2.doubleValue();
        switch (a.f21696a[bVar.ordinal()]) {
            case 1:
                if (dDoubleValue2 != dDoubleValue) {
                    break;
                }
                break;
            case 2:
                if (dDoubleValue2 == dDoubleValue) {
                    break;
                }
                break;
            case 3:
            case 4:
            case 5:
                e3.i1(e3.z.ERROR, "Attempted to use an invalid operator with a numeric value: " + bVar.toString());
                break;
            case 6:
                if (dDoubleValue2 >= dDoubleValue) {
                    break;
                }
                break;
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                if (dDoubleValue2 <= dDoubleValue) {
                    break;
                }
                break;
            case 8:
                if (dDoubleValue2 >= dDoubleValue && dDoubleValue2 != dDoubleValue) {
                    break;
                }
                break;
            case 9:
                if (dDoubleValue2 <= dDoubleValue && dDoubleValue2 != dDoubleValue) {
                    break;
                }
                break;
        }
        return false;
    }

    private boolean i(Number number, String str, z2.b bVar) throws NumberFormatException {
        try {
            return h(Double.valueOf(number.doubleValue()), Double.valueOf(Double.parseDouble(str)), bVar);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private boolean j(String str, String str2, z2.b bVar) {
        int i10 = a.f21696a[bVar.ordinal()];
        if (i10 == 1) {
            return str.equals(str2);
        }
        if (i10 == 2) {
            return !str.equals(str2);
        }
        e3.i1(e3.z.ERROR, "Attempted to use an invalid operator for a string trigger comparison: " + bVar.toString());
        return false;
    }

    void a(Map map) {
        synchronized (this.f21695b) {
            for (String str : map.keySet()) {
                this.f21695b.put(str, map.get(str));
            }
        }
    }

    boolean c(f1 f1Var) {
        if (f1Var.f21996c.size() == 0) {
            return true;
        }
        Iterator it = f1Var.f21996c.iterator();
        while (it.hasNext()) {
            if (b((ArrayList) it.next())) {
                return true;
            }
        }
        return false;
    }

    boolean e(f1 f1Var, Collection collection) {
        if (f1Var.f21996c == null) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = f1Var.f21996c.iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((ArrayList) it2.next()).iterator();
                while (it3.hasNext()) {
                    z2 z2Var = (z2) it3.next();
                    if (str.equals(z2Var.f22543c) || str.equals(z2Var.f22541a)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean f(f1 f1Var) {
        ArrayList arrayList = f1Var.f21996c;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        Iterator it = f1Var.f21996c.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) it.next()).iterator();
            while (it2.hasNext()) {
                z2.a aVar = ((z2) it2.next()).f22542b;
                if (aVar == z2.a.CUSTOM || aVar == z2.a.UNKNOWN) {
                    return false;
                }
            }
        }
        return true;
    }
}
