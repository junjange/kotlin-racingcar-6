package racingcar.utils

import racingcar.utils.Constant.GAME_OVER_MESSAGE

object Exception {

    fun String.requireValidCarNames() = require(this.trim().split(",").all { it.length in 1..5 }) { GAME_OVER_MESSAGE }

}