package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.core.content.res.k;
import androidx.core.graphics.d;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class d {

    private static class a implements TypeEvaluator {

        /* renamed from: a, reason: collision with root package name */
        private d.b[] f3913a;

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d.b[] evaluate(float f5, d.b[] bVarArr, d.b[] bVarArr2) {
            if (!androidx.core.graphics.d.b(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!androidx.core.graphics.d.b(this.f3913a, bVarArr)) {
                this.f3913a = androidx.core.graphics.d.f(bVarArr);
            }
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                this.f3913a[i10].d(bVarArr[i10], bVarArr2[i10], f5);
            }
            return this.f3913a;
        }
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f5) {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        if (r23 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
    
        if (r13 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
    
        if (r2.hasNext() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fd, code lost:
    
        if (r24 != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ff, code lost:
    
        r23.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
    
        r23.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0106, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.animation.Animator b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.d.b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    private static Keyframe c(Keyframe keyframe, float f5) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f5) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f5) : Keyframe.ofObject(f5);
    }

    private static void d(Keyframe[] keyframeArr, float f5, int i10, int i11) {
        float f10 = f5 / ((i11 - i10) + 2);
        while (i10 <= i11) {
            keyframeArr[i10].setFraction(keyframeArr[i10 - 1].getFraction() + f10);
            i10++;
        }
    }

    private static PropertyValuesHolder e(TypedArray typedArray, int i10, int i11, int i12, String str) {
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i11);
        boolean z10 = typedValuePeekValue != null;
        int i13 = z10 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i12);
        boolean z11 = typedValuePeekValue2 != null;
        int i14 = z11 ? typedValuePeekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z10 && h(i13)) || (z11 && h(i14))) ? 3 : 0;
        }
        boolean z12 = i10 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i10 != 2) {
            e eVarA = i10 == 3 ? e.a() : null;
            if (z12) {
                if (z10) {
                    float dimension = i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                    if (z11) {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                    } else {
                        propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                }
                propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
            } else if (z10) {
                int dimension2 = i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : h(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
                if (z11) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : h(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z11) {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : h(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
            }
            if (propertyValuesHolderOfInt == null || eVarA == null) {
                return propertyValuesHolderOfInt;
            }
            propertyValuesHolderOfInt.setEvaluator(eVarA);
            return propertyValuesHolderOfInt;
        }
        String string = typedArray.getString(i11);
        String string2 = typedArray.getString(i12);
        d.b[] bVarArrD = androidx.core.graphics.d.d(string);
        d.b[] bVarArrD2 = androidx.core.graphics.d.d(string2);
        if (bVarArrD == null && bVarArrD2 == null) {
            return null;
        }
        if (bVarArrD == null) {
            if (bVarArrD2 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), bVarArrD2);
            }
            return null;
        }
        a aVar = new a();
        if (bVarArrD2 == null) {
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, aVar, bVarArrD);
        } else {
            if (!androidx.core.graphics.d.b(bVarArrD, bVarArrD2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, aVar, bVarArrD, bVarArrD2);
        }
        return propertyValuesHolderOfObject;
    }

    private static int f(TypedArray typedArray, int i10, int i11) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        boolean z10 = typedValuePeekValue != null;
        int i12 = z10 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i11);
        boolean z11 = typedValuePeekValue2 != null;
        return ((z10 && h(i12)) || (z11 && h(z11 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
    }

    private static int g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayK = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f3897j);
        int i10 = 0;
        TypedValue typedValueL = k.l(typedArrayK, xmlPullParser, "value", 0);
        if ((typedValueL != null) && h(typedValueL.type)) {
            i10 = 3;
        }
        typedArrayK.recycle();
        return i10;
    }

    private static boolean h(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    public static Animator i(Context context, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i10) : j(context, context.getResources(), context.getTheme(), i10);
    }

    public static Animator j(Context context, Resources resources, Resources.Theme theme, int i10) {
        return k(context, resources, theme, i10, 1.0f);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, int i10, float f5) {
        XmlResourceParser animation = null;
        try {
            try {
                try {
                    animation = resources.getAnimation(i10);
                    return a(context, resources, theme, animation, f5);
                } catch (IOException e5) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                    notFoundException.initCause(e5);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e10) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                notFoundException2.initCause(e10);
                throw notFoundException2;
            }
        } finally {
            if (animation != null) {
                animation.close();
            }
        }
    }

    private static ValueAnimator l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f5, XmlPullParser xmlPullParser) {
        TypedArray typedArrayK = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f3894g);
        TypedArray typedArrayK2 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f3898k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        q(valueAnimator, typedArrayK, typedArrayK2, f5, xmlPullParser);
        int iH = k.h(typedArrayK, xmlPullParser, "interpolator", 0, 0);
        if (iH > 0) {
            valueAnimator.setInterpolator(c.a(context, iH));
        }
        typedArrayK.recycle();
        if (typedArrayK2 != null) {
            typedArrayK2.recycle();
        }
        return valueAnimator;
    }

    private static Keyframe m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i10, XmlPullParser xmlPullParser) {
        TypedArray typedArrayK = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f3897j);
        float f5 = k.f(typedArrayK, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue typedValueL = k.l(typedArrayK, xmlPullParser, "value", 0);
        boolean z10 = typedValueL != null;
        if (i10 == 4) {
            i10 = (z10 && h(typedValueL.type)) ? 3 : 0;
        }
        Keyframe keyframeOfInt = z10 ? i10 != 0 ? (i10 == 1 || i10 == 3) ? Keyframe.ofInt(f5, k.g(typedArrayK, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(f5, k.f(typedArrayK, xmlPullParser, "value", 0, 0.0f)) : i10 == 0 ? Keyframe.ofFloat(f5) : Keyframe.ofInt(f5);
        int iH = k.h(typedArrayK, xmlPullParser, "interpolator", 1, 0);
        if (iH > 0) {
            keyframeOfInt.setInterpolator(c.a(context, iH));
        }
        typedArrayK.recycle();
        return keyframeOfInt;
    }

    private static ObjectAnimator n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f5, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        l(context, resources, theme, attributeSet, objectAnimator, f5, xmlPullParser);
        return objectAnimator;
    }

    private static PropertyValuesHolder o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i10) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolderOfKeyframe = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i10 == 4) {
                    i10 = g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe keyframeM = m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i10, xmlPullParser);
                if (keyframeM != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(keyframeM);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i11 = 0; i11 < size; i11++) {
                Keyframe keyframe3 = keyframeArr[i11];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i11 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i12 = size - 1;
                        if (i11 == i12) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i13 = i11;
                            for (int i14 = i11 + 1; i14 < i12 && keyframeArr[i14].getFraction() < 0.0f; i14++) {
                                i13 = i14;
                            }
                            d(keyframeArr, keyframeArr[i13 + 1].getFraction() - keyframeArr[i11 - 1].getFraction(), i11, i13);
                        }
                    }
                }
            }
            propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i10 == 3) {
                propertyValuesHolderOfKeyframe.setEvaluator(e.a());
            }
        }
        return propertyValuesHolderOfKeyframe;
    }

    private static PropertyValuesHolder[] p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i10;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("propertyValuesHolder")) {
                TypedArray typedArrayK = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f3896i);
                String strI = k.i(typedArrayK, xmlPullParser, "propertyName", 3);
                int iG = k.g(typedArrayK, xmlPullParser, "valueType", 2, 4);
                PropertyValuesHolder propertyValuesHolderO = o(context, resources, theme, xmlPullParser, strI, iG);
                if (propertyValuesHolderO == null) {
                    propertyValuesHolderO = e(typedArrayK, iG, 0, 1, strI);
                }
                if (propertyValuesHolderO != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(propertyValuesHolderO);
                }
                typedArrayK.recycle();
            }
            xmlPullParser.next();
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i10 = 0; i10 < size; i10++) {
                propertyValuesHolderArr[i10] = (PropertyValuesHolder) arrayList.get(i10);
            }
        }
        return propertyValuesHolderArr;
    }

    private static void q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f5, XmlPullParser xmlPullParser) {
        long jG = k.g(typedArray, xmlPullParser, "duration", 1, 300);
        long jG2 = k.g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int iG = k.g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (k.j(xmlPullParser, "valueFrom") && k.j(xmlPullParser, "valueTo")) {
            if (iG == 4) {
                iG = f(typedArray, 5, 6);
            }
            PropertyValuesHolder propertyValuesHolderE = e(typedArray, iG, 5, 6, "");
            if (propertyValuesHolderE != null) {
                valueAnimator.setValues(propertyValuesHolderE);
            }
        }
        valueAnimator.setDuration(jG);
        valueAnimator.setStartDelay(jG2);
        valueAnimator.setRepeatCount(k.g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(k.g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            r(valueAnimator, typedArray2, iG, f5, xmlPullParser);
        }
    }

    private static void r(ValueAnimator valueAnimator, TypedArray typedArray, int i10, float f5, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String strI = k.i(typedArray, xmlPullParser, "pathData", 1);
        if (strI == null) {
            objectAnimator.setPropertyName(k.i(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String strI2 = k.i(typedArray, xmlPullParser, "propertyXName", 2);
        String strI3 = k.i(typedArray, xmlPullParser, "propertyYName", 3);
        if (i10 != 2) {
        }
        if (strI2 != null || strI3 != null) {
            s(androidx.core.graphics.d.e(strI), objectAnimator, f5 * 0.5f, strI2, strI3);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    private static void s(Path path, ObjectAnimator objectAnimator, float f5, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f10 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float length = 0.0f;
        do {
            length += pathMeasure.getLength();
            arrayList.add(Float.valueOf(length));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int iMin = Math.min(100, ((int) (length / f5)) + 1);
        float[] fArr = new float[iMin];
        float[] fArr2 = new float[iMin];
        float[] fArr3 = new float[2];
        float f11 = length / (iMin - 1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= iMin) {
                break;
            }
            pathMeasure2.getPosTan(f10 - ((Float) arrayList.get(i11)).floatValue(), fArr3, null);
            fArr[i10] = fArr3[0];
            fArr2[i10] = fArr3[1];
            f10 += f11;
            int i12 = i11 + 1;
            if (i12 < arrayList.size() && f10 > ((Float) arrayList.get(i12)).floatValue()) {
                pathMeasure2.nextContour();
                i11 = i12;
            }
            i10++;
        }
        PropertyValuesHolder propertyValuesHolderOfFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder propertyValuesHolderOfFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (propertyValuesHolderOfFloat == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat2);
        } else if (propertyValuesHolderOfFloat2 == null) {
            objectAnimator.setValues(propertyValuesHolderOfFloat);
        } else {
            objectAnimator.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
        }
    }
}
