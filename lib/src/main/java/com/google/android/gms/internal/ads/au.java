package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class au extends RelativeLayout {

    /* renamed from: n, reason: collision with root package name */
    private static final float[] f6246n = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: m, reason: collision with root package name */
    private AnimationDrawable f6247m;

    public au(Context context, zt ztVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        e4.p.l(ztVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f6246n, null, null));
        shapeDrawable.getPaint().setColor(ztVar.f());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(ztVar.h())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(ztVar.h());
            textView.setTextColor(ztVar.c());
            textView.setTextSize(ztVar.M5());
            k3.t.b();
            int iZ = se0.z(context, 4);
            k3.t.b();
            textView.setPadding(iZ, 0, se0.z(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List listN5 = ztVar.N5();
        if (listN5 != null && listN5.size() > 1) {
            this.f6247m = new AnimationDrawable();
            Iterator it = listN5.iterator();
            while (it.hasNext()) {
                try {
                    this.f6247m.addFrame((Drawable) l4.b.L0(((cu) it.next()).e()), ztVar.b());
                } catch (Exception e5) {
                    ze0.e("Error while getting drawable.", e5);
                }
            }
            imageView.setBackground(this.f6247m);
        } else if (listN5.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) l4.b.L0(((cu) listN5.get(0)).e()));
            } catch (Exception e10) {
                ze0.e("Error while getting drawable.", e10);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f6247m;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
