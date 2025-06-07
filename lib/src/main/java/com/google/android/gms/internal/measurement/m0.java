package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class m0 extends x {
    protected m0() {
        this.f19387a.add(n0.ASSIGN);
        this.f19387a.add(n0.CONST);
        this.f19387a.add(n0.CREATE_ARRAY);
        this.f19387a.add(n0.CREATE_OBJECT);
        this.f19387a.add(n0.EXPRESSION_LIST);
        this.f19387a.add(n0.GET);
        this.f19387a.add(n0.GET_INDEX);
        this.f19387a.add(n0.GET_PROPERTY);
        this.f19387a.add(n0.NULL);
        this.f19387a.add(n0.SET_PROPERTY);
        this.f19387a.add(n0.TYPEOF);
        this.f19387a.add(n0.UNDEFINED);
        this.f19387a.add(n0.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final q a(String str, r4 r4Var, List list) {
        String str2;
        n0 n0Var = n0.ADD;
        int iOrdinal = s5.e(str).ordinal();
        int i10 = 0;
        if (iOrdinal == 3) {
            s5.h(n0.ASSIGN.name(), 2, list);
            q qVarB = r4Var.b((q) list.get(0));
            if (!(qVarB instanceof u)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", qVarB.getClass().getCanonicalName()));
            }
            if (!r4Var.h(qVarB.i())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", qVarB.i()));
            }
            q qVarB2 = r4Var.b((q) list.get(1));
            r4Var.g(qVarB.i(), qVarB2);
            return qVarB2;
        }
        if (iOrdinal == 14) {
            s5.i(n0.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            for (int i11 = 0; i11 < list.size() - 1; i11 += 2) {
                q qVarB3 = r4Var.b((q) list.get(i11));
                if (!(qVarB3 instanceof u)) {
                    throw new IllegalArgumentException(String.format("Expected string for const name. got %s", qVarB3.getClass().getCanonicalName()));
                }
                r4Var.f(qVarB3.i(), r4Var.b((q) list.get(i11 + 1)));
            }
            return q.f19193b;
        }
        if (iOrdinal == 24) {
            s5.i(n0.EXPRESSION_LIST.name(), 1, list);
            q qVarB4 = q.f19193b;
            while (i10 < list.size()) {
                qVarB4 = r4Var.b((q) list.get(i10));
                if (qVarB4 instanceof h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i10++;
            }
            return qVarB4;
        }
        if (iOrdinal == 33) {
            s5.h(n0.GET.name(), 1, list);
            q qVarB5 = r4Var.b((q) list.get(0));
            if (qVarB5 instanceof u) {
                return r4Var.d(qVarB5.i());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", qVarB5.getClass().getCanonicalName()));
        }
        if (iOrdinal == 49) {
            s5.h(n0.NULL.name(), 0, list);
            return q.f19194c;
        }
        if (iOrdinal == 58) {
            s5.h(n0.SET_PROPERTY.name(), 3, list);
            q qVarB6 = r4Var.b((q) list.get(0));
            q qVarB7 = r4Var.b((q) list.get(1));
            q qVarB8 = r4Var.b((q) list.get(2));
            if (qVarB6 == q.f19193b || qVarB6 == q.f19194c) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", qVarB7.i(), qVarB6.i()));
            }
            if ((qVarB6 instanceof f) && (qVarB7 instanceof i)) {
                ((f) qVarB6).x(qVarB7.g().intValue(), qVarB8);
            } else if (qVarB6 instanceof m) {
                ((m) qVarB6).n0(qVarB7.i(), qVarB8);
            }
            return qVarB8;
        }
        if (iOrdinal == 17) {
            if (list.isEmpty()) {
                return new f();
            }
            f fVar = new f();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                q qVarB9 = r4Var.b((q) it.next());
                if (qVarB9 instanceof h) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                fVar.x(i10, qVarB9);
                i10++;
            }
            return fVar;
        }
        if (iOrdinal == 18) {
            if (list.isEmpty()) {
                return new n();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            n nVar = new n();
            while (i10 < list.size() - 1) {
                q qVarB10 = r4Var.b((q) list.get(i10));
                q qVarB11 = r4Var.b((q) list.get(i10 + 1));
                if ((qVarB10 instanceof h) || (qVarB11 instanceof h)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                nVar.n0(qVarB10.i(), qVarB11);
                i10 += 2;
            }
            return nVar;
        }
        if (iOrdinal == 35 || iOrdinal == 36) {
            s5.h(n0.GET_PROPERTY.name(), 2, list);
            q qVarB12 = r4Var.b((q) list.get(0));
            q qVarB13 = r4Var.b((q) list.get(1));
            if ((qVarB12 instanceof f) && s5.k(qVarB13)) {
                return ((f) qVarB12).o(qVarB13.g().intValue());
            }
            if (qVarB12 instanceof m) {
                return ((m) qVarB12).J(qVarB13.i());
            }
            if (qVarB12 instanceof u) {
                if ("length".equals(qVarB13.i())) {
                    return new i(Double.valueOf(qVarB12.i().length()));
                }
                if (s5.k(qVarB13) && qVarB13.g().doubleValue() < qVarB12.i().length()) {
                    return new u(String.valueOf(qVarB12.i().charAt(qVarB13.g().intValue())));
                }
            }
            return q.f19193b;
        }
        switch (iOrdinal) {
            case 62:
                s5.h(n0.TYPEOF.name(), 1, list);
                q qVarB14 = r4Var.b((q) list.get(0));
                if (qVarB14 instanceof v) {
                    str2 = "undefined";
                } else if (qVarB14 instanceof g) {
                    str2 = "boolean";
                } else if (qVarB14 instanceof i) {
                    str2 = "number";
                } else if (qVarB14 instanceof u) {
                    str2 = "string";
                } else if (qVarB14 instanceof p) {
                    str2 = "function";
                } else {
                    if ((qVarB14 instanceof r) || (qVarB14 instanceof h)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", qVarB14));
                    }
                    str2 = "object";
                }
                return new u(str2);
            case 63:
                s5.h(n0.UNDEFINED.name(), 0, list);
                return q.f19193b;
            case 64:
                s5.i(n0.VAR.name(), 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    q qVarB15 = r4Var.b((q) it2.next());
                    if (!(qVarB15 instanceof u)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", qVarB15.getClass().getCanonicalName()));
                    }
                    r4Var.e(qVarB15.i(), q.f19193b);
                }
                return q.f19193b;
            default:
                return super.b(str);
        }
    }
}
