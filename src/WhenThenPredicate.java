/*
 * Copyright 2000-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiMethodCallExpression;
import com.intellij.psi.PsiReferenceExpression;
import com.siyeh.ipp.base.PsiElementPredicate;

/**
 * Created by daniel on 18.01.14.
 */
public class WhenThenPredicate implements PsiElementPredicate {
  @Override
  public boolean satisfiedBy(PsiElement element) {
    if (!(element instanceof PsiMethodCallExpression)) {
      return false;
    }

    PsiMethodCallExpression expression = (PsiMethodCallExpression)element;
    PsiReferenceExpression methodExpression = expression.getMethodExpression();
    String methodName = methodExpression.getReferenceName();
    if (!("when".equals(methodName))) {
      return false;
    }
    //
    ////methodExpression.
    //
    return true;
  }
}
