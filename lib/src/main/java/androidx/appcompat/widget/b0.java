package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* loaded from: classes.dex */
final class b0 {

    /* renamed from: a, reason: collision with root package name */
    private TextView f1101a;

    /* renamed from: b, reason: collision with root package name */
    private TextClassifier f1102b;

    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    b0(TextView textView) {
        this.f1101a = (TextView) androidx.core.util.h.f(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f1102b;
        return textClassifier == null ? a.a(this.f1101a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f1102b = textClassifier;
    }
}
