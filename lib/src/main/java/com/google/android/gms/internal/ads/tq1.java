package com.google.android.gms.internal.ads;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;

/* loaded from: classes.dex */
public final class tq1 {
    tq1() {
    }

    public static final void a(Context context, ViewGroup viewGroup, AdView adView) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout");
        f(linearLayout, -1, -1);
        linearLayout.setGravity(17);
        linearLayout.addView(adView);
        adView.setTag("ad_view");
        viewGroup.addView(linearLayout);
    }

    public static final void b(Context context, ViewGroup viewGroup, r3.c cVar) {
        r3.e eVar = new r3.e(context);
        eVar.setTag("ad_view_tag");
        f(eVar, -1, -1);
        viewGroup.addView(eVar);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout_tag");
        linearLayout.setOrientation(1);
        f(linearLayout, -1, -1);
        linearLayout.setBackgroundColor(-1);
        eVar.addView(linearLayout);
        Resources resourcesD = j3.t.q().d();
        linearLayout.addView(c(context, resourcesD == null ? "Headline" : resourcesD.getString(i3.b.f24288b), "headline_header_tag"));
        View viewD = d(context, y33.c(cVar.b()), "headline_tag");
        eVar.setHeadlineView(viewD);
        linearLayout.addView(viewD);
        linearLayout.addView(c(context, resourcesD == null ? "Body" : resourcesD.getString(i3.b.f24287a), "body_header_tag"));
        View viewD2 = d(context, y33.c(cVar.a()), "body_tag");
        eVar.setBodyView(viewD2);
        linearLayout.addView(viewD2);
        linearLayout.addView(c(context, resourcesD == null ? "Media View" : resourcesD.getString(i3.b.f24289c), "media_view_header_tag"));
        r3.b bVar = new r3.b(context);
        bVar.setTag("media_view_tag");
        eVar.setMediaView(bVar);
        linearLayout.addView(bVar);
        eVar.setNativeAd(cVar);
    }

    private static TextView c(Context context, String str, String str2) {
        return e(context, str, R.style.TextAppearance.Small, -9210245, 0.0f, str2);
    }

    private static TextView d(Context context, String str, String str2) {
        return e(context, str, R.style.TextAppearance.Medium, -16777216, 12.0f, str2);
    }

    private static TextView e(Context context, String str, int i10, int i11, float f5, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        f(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f5, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i10);
        textView.setTextColor(i11);
        textView.setText(str);
        return textView;
    }

    private static void f(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i10;
        layoutParams2.width = i11;
        view.setLayoutParams(layoutParams2);
    }
}
