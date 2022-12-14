/*
 * Copyright 2020-2022 JetBrains s.r.o. and respective authors and developers.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE.txt file.
 */

import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import org.jetbrains.compose.resources.demo.shared.HelloCompose

fun main() =
    singleWindowApplication(
        title = "Resources demo",
        state = WindowState(size = DpSize(800.dp, 800.dp))
    ) {
        HelloCompose()
    }

@Preview
@Composable
fun CheckPreview() {
    HelloCompose()
}