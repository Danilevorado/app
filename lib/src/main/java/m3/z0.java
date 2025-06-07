package m3;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.hn2;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.t23;
import com.google.android.gms.internal.ads.w33;
import com.google.android.gms.internal.ads.ze0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class z0 {
    public static Point a(MotionEvent motionEvent, View view) {
        int[] iArrJ = j(view);
        return new Point(((int) motionEvent.getRawX()) - iArrJ[0], ((int) motionEvent.getRawY()) - iArrJ[1]);
    }

    public static WindowManager.LayoutParams b() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) k3.w.c().b(ir.f10139x7)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject c(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("x", k3.t.b().e(context, point2.x));
                    jSONObject3.put("y", k3.t.b().e(context, point2.y));
                    jSONObject3.put("start_x", k3.t.b().e(context, point.x));
                    jSONObject3.put("start_y", k3.t.b().e(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e5) {
                    ze0.e("Error occurred while putting signals into JSON object.", e5);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e10) {
                e = e10;
                jSONObject = jSONObject2;
                ze0.e("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static JSONObject d(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        String str;
        String str2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject3 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject3;
        }
        int[] iArrJ = j(view);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            View view2 = (View) ((WeakReference) entry.getValue()).get();
            if (view2 != null) {
                int[] iArrJ2 = j(view2);
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                Iterator it2 = it;
                try {
                    JSONObject jSONObject6 = jSONObject3;
                    try {
                        jSONObject5.put("width", k3.t.b().e(context, view2.getMeasuredWidth()));
                        jSONObject5.put("height", k3.t.b().e(context, view2.getMeasuredHeight()));
                        jSONObject5.put("x", k3.t.b().e(context, iArrJ2[0] - iArrJ[0]));
                        jSONObject5.put("y", k3.t.b().e(context, iArrJ2[1] - iArrJ[1]));
                        jSONObject5.put(str4, str3);
                        jSONObject4.put("frame", jSONObject5);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject2 = k(context, rect);
                        } else {
                            jSONObject2 = new JSONObject();
                            jSONObject2.put("width", 0);
                            jSONObject2.put("height", 0);
                            jSONObject2.put("x", k3.t.b().e(context, iArrJ2[0] - iArrJ[0]));
                            jSONObject2.put("y", k3.t.b().e(context, iArrJ2[1] - iArrJ[1]));
                            jSONObject2.put(str4, str3);
                        }
                        jSONObject4.put("visible_bounds", jSONObject2);
                        if (((String) entry.getKey()).equals("3010")) {
                            if (((Boolean) k3.w.c().b(ir.f10073r7)).booleanValue()) {
                                jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                            }
                            if (((Boolean) k3.w.c().b(ir.f10084s7)).booleanValue()) {
                                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                jSONObject4.put("view_width_layout_type", l(layoutParams.width) - 1);
                                jSONObject4.put("view_height_layout_type", l(layoutParams.height) - 1);
                            }
                            if (((Boolean) k3.w.c().b(ir.f10095t7)).booleanValue()) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(Integer.valueOf(view2.getId()));
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    arrayList.add(Integer.valueOf(((View) parent).getId()));
                                }
                                jSONObject4.put("view_path", TextUtils.join("/", arrayList));
                            }
                            if (((Boolean) k3.w.c().b(ir.f10106u7)).booleanValue() && scaleType != null) {
                                jSONObject4.put("mediaview_scale_type", scaleType.ordinal());
                            }
                        }
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject4.put("text_color", textView.getCurrentTextColor());
                            str = str3;
                            str2 = str4;
                            try {
                                jSONObject4.put("font_size", textView.getTextSize());
                                jSONObject4.put("text", textView.getText());
                            } catch (JSONException unused) {
                                jSONObject = jSONObject6;
                                ze0.g("Unable to get asset views information");
                                it = it2;
                                jSONObject3 = jSONObject;
                                str3 = str;
                                str4 = str2;
                            }
                        } else {
                            str = str3;
                            str2 = str4;
                        }
                        jSONObject4.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                        jSONObject = jSONObject6;
                        try {
                            jSONObject.put((String) entry.getKey(), jSONObject4);
                        } catch (JSONException unused2) {
                            ze0.g("Unable to get asset views information");
                            it = it2;
                            jSONObject3 = jSONObject;
                            str3 = str;
                            str4 = str2;
                        }
                    } catch (JSONException unused3) {
                        str = str3;
                        str2 = str4;
                    }
                } catch (JSONException unused4) {
                    str = str3;
                    str2 = str4;
                    jSONObject = jSONObject3;
                }
                it = it2;
                jSONObject3 = jSONObject;
                str3 = str;
                str4 = str2;
            }
        }
        return jSONObject3;
    }

    public static JSONObject e(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            j3.t.r();
            jSONObject.put("can_show_on_lock_screen", b2.H(view));
            j3.t.r();
            jSONObject.put("is_keyguard_locked", b2.V(context));
        } catch (JSONException unused) {
            ze0.g("Unable to get lock screen information");
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject f(android.view.View r6) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            com.google.android.gms.internal.ads.zq r1 = com.google.android.gms.internal.ads.ir.f10062q7     // Catch: java.lang.Exception -> L58
            com.google.android.gms.internal.ads.gr r2 = k3.w.c()     // Catch: java.lang.Exception -> L58
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Exception -> L58
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L58
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L58
            r2 = 0
            r3 = 1
            java.lang.String r4 = "contained_in_scroll_view"
            if (r1 == 0) goto L38
            j3.t.r()     // Catch: java.lang.Exception -> L58
            android.view.ViewParent r6 = r6.getParent()     // Catch: java.lang.Exception -> L58
        L25:
            if (r6 == 0) goto L30
            boolean r1 = r6 instanceof android.widget.ScrollView     // Catch: java.lang.Exception -> L58
            if (r1 != 0) goto L30
            android.view.ViewParent r6 = r6.getParent()     // Catch: java.lang.Exception -> L58
            goto L25
        L30:
            if (r6 != 0) goto L33
            goto L34
        L33:
            r2 = r3
        L34:
            r0.put(r4, r2)     // Catch: java.lang.Exception -> L58
            goto L58
        L38:
            j3.t.r()     // Catch: java.lang.Exception -> L58
            android.view.ViewParent r1 = r6.getParent()     // Catch: java.lang.Exception -> L58
        L3f:
            if (r1 == 0) goto L4a
            boolean r5 = r1 instanceof android.widget.AdapterView     // Catch: java.lang.Exception -> L58
            if (r5 != 0) goto L4a
            android.view.ViewParent r1 = r1.getParent()     // Catch: java.lang.Exception -> L58
            goto L3f
        L4a:
            r5 = -1
            if (r1 != 0) goto L4f
            r6 = r5
            goto L55
        L4f:
            android.widget.AdapterView r1 = (android.widget.AdapterView) r1     // Catch: java.lang.Exception -> L58
            int r6 = r1.getPositionForView(r6)     // Catch: java.lang.Exception -> L58
        L55:
            if (r6 == r5) goto L34
            goto L33
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.z0.f(android.view.View):org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016c A[Catch: JSONException -> 0x0170, PHI: r4
  0x016c: PHI (r4v5 int) = (r4v4 int), (r4v6 int) binds: [B:44:0x0163, B:47:0x016b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #6 {JSONException -> 0x0170, blocks: (B:30:0x013c, B:46:0x0167, B:48:0x016c), top: B:64:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0171 -> B:63:0x0176). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject g(android.content.Context r16, android.view.View r17) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.z0.g(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static boolean h(Context context, hn2 hn2Var) {
        if (!hn2Var.O) {
            return false;
        }
        if (((Boolean) k3.w.c().b(ir.f10117v7)).booleanValue()) {
            return ((Boolean) k3.w.c().b(ir.f10150y7)).booleanValue();
        }
        String str = (String) k3.w.c().b(ir.f10128w7);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = w33.c(t23.c(';')).d(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean i(int i10) {
        if (((Boolean) k3.w.c().b(ir.f9896b3)).booleanValue()) {
            return ((Boolean) k3.w.c().b(ir.f9907c3)).booleanValue() || i10 <= 15299999;
        }
        return true;
    }

    public static int[] j(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    private static JSONObject k(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", k3.t.b().e(context, rect.right - rect.left));
        jSONObject.put("height", k3.t.b().e(context, rect.bottom - rect.top));
        jSONObject.put("x", k3.t.b().e(context, rect.left));
        jSONObject.put("y", k3.t.b().e(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static int l(int i10) {
        if (i10 != -2) {
            return i10 != -1 ? 2 : 3;
        }
        return 4;
    }
}
