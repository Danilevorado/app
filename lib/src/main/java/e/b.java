package e;

import android.content.Context;
import android.content.Intent;
import e.a;
import hb.k;
import hb.o;
import ib.a0;
import ib.r;
import ib.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import rb.f;
import rb.h;

/* loaded from: classes.dex */
public final class b extends e.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23002a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final Intent a(String[] strArr) {
            h.e(strArr, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            h.d(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }
    }

    @Override // e.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] strArr) {
        h.e(context, "context");
        h.e(strArr, "input");
        return f23002a.a(strArr);
    }

    @Override // e.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public a.C0121a b(Context context, String[] strArr) {
        h.e(context, "context");
        h.e(strArr, "input");
        boolean z10 = true;
        if (strArr.length == 0) {
            return new a.C0121a(a0.d());
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!(androidx.core.content.a.a(context, strArr[i10]) == 0)) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (!z10) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ub.f.a(z.a(strArr.length), 16));
        for (String str : strArr) {
            k kVarA = o.a(str, Boolean.TRUE);
            linkedHashMap.put(kVarA.c(), kVarA.d());
        }
        return new a.C0121a(linkedHashMap);
    }

    @Override // e.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map c(int i10, Intent intent) {
        if (i10 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return a0.d();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i11 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i11 == 0));
            }
            return a0.h(r.r(ib.f.c(stringArrayExtra), arrayList));
        }
        return a0.d();
    }
}
