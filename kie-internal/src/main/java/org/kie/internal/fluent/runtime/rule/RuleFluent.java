/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.internal.fluent.runtime.rule;

import org.kie.api.runtime.rule.FactHandle;
import org.kie.api.runtime.rule.RuleRuntime;
import org.kie.api.runtime.rule.StatefulRuleSession;

/**
 * See {@link RuleRuntime} and {@link StatefulRuleSession}
 */
public interface RuleFluent<T> {

    T fireAllRules();
    
    T setGlobal( String identifier, Object object );
    
    T getGlobal(String identifier);
    
    T insert(Object object);  
    
    T update( FactHandle handle, Object object );  
    
    T delete(FactHandle handle);

}
