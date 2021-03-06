/*
 * Copyright 2019 Stephane Nicolas
 * Copyright 2019 Daniel Molinero Reguera
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package toothpick.compiler.common.generators.targets;

import javax.lang.model.element.TypeElement;

public class ParamInjectionTarget {

  public TypeElement memberClass;
  public final String memberName;
  public final Kind kind;
  public final TypeElement kindParamClass;
  public final Object name;

  public ParamInjectionTarget(
      TypeElement memberClass,
      String memberName,
      Kind kind,
      TypeElement kindParamClass,
      Object name) {
    this.memberClass = memberClass;
    this.memberName = memberName;
    this.kind = kind;
    this.kindParamClass = kindParamClass;
    this.name = name;
  }

  public enum Kind {
    INSTANCE,
    PROVIDER,
    LAZY,
  }
}
