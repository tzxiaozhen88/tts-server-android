package com.github.jing332.tts_server_android.ui.systts.speech_rule

import com.drake.brv.annotaion.ItemOrientation
import com.drake.brv.item.ItemDrag
import com.github.jing332.tts_server_android.data.entities.SpeechRule

data class SpeechRuleModel(
    val data: SpeechRule,
    override var itemOrientationDrag: Int = ItemOrientation.VERTICAL
) : ItemDrag {
    val isEnabled: Boolean get() = data.isEnabled

    val title: String
        get() = data.name

    val subTitle: String
        get() = "${data.author} - v${data.version}"

}