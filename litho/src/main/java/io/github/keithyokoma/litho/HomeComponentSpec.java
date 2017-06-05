package io.github.keithyokoma.litho;

import com.facebook.litho.Column;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.ComponentLayout;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.widget.Text;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaWrap;

/**
 * Created by KeishinYokomaku on 2017/06/05.
 */
@LayoutSpec
/* package */ class HomeComponentSpec {
	@OnCreateLayout
	/* package */ static ComponentLayout onCreateLayout(ComponentContext c) {
		ComponentLayout.ContainerBuilder builder = Column.create(c)
				.justifyContent(YogaJustify.SPACE_AROUND)
				.layoutDirection(YogaDirection.INHERIT)
				.wrap(YogaWrap.NO_WRAP);
		for (int i = 0; i < 10000; i++) {
			builder = builder.child(Text.create(c)
					.text("Hello World!")
					.textSizeSp(14)
					.withLayout()
					.build());
		}
		return builder.build();
	}
}
