/**
 *
 *  Copyright 2004 Brian Topping
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.dentaku.services.persistence.tranql;

import org.tranql.query.UpdateCommand;
import org.tranql.ql.Query;
import org.tranql.ql.QueryException;
import org.tranql.cache.InTxCache;
import org.tranql.field.Row;

public class DentakuUpdateCommand implements UpdateCommand {
    private final Query query;

    public DentakuUpdateCommand(Query query) {
        this.query = query;
    }

    public Query getQuery() {
        return query;
    }

    public int execute(InTxCache cache, Row params) throws QueryException {
        throw new UnsupportedOperationException();
    }
}
