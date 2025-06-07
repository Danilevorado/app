package l4;

import android.os.IBinder;
import e4.p;
import java.lang.reflect.Field;
import l4.a;

/* loaded from: classes.dex */
public final class b extends a.AbstractBinderC0158a {

    /* renamed from: m, reason: collision with root package name */
    private final Object f25106m;

    private b(Object obj) {
        this.f25106m = obj;
    }

    public static Object L0(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f25106m;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        p.l(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e5) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e5);
        } catch (NullPointerException e10) {
            throw new IllegalArgumentException("Binder object is null.", e10);
        }
    }

    public static a p1(Object obj) {
        return new b(obj);
    }
}
