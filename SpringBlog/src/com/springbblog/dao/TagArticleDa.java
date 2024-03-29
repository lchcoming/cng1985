/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2010 huliqing, huliqing.cn@gmail.com
 *
 * This file is part of QBlog.
 * QBlog is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * QBlog is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with QBlog.  If not, see <http://www.gnu.org/licenses/>.
 *
 * 这个文件是QBlog的一部分。
 * 您可以单独使用或分发这个文件，但请不要移除这个头部声明信息.
 * QBlog是一个自由软件，您可以自由分发、修改其中的源代码或者重新发布它，
 * 新的任何修改后的重新发布版必须同样在遵守LGPL3或更后续的版本协议下发布.
 * 关于LGPL协议的细则请参考COPYING、COPYING.LESSER文件，
 * 您可以在QBlog的相关目录中获得LGPL协议的副本，
 * 如果没有找到，请连接到 http://www.gnu.org/licenses/ 查看。
 *
 * - Author: Huliqing
 * - Contact: huliqing.cn@gmail.com
 * - License: GNU Lesser General Public License (LGPL)
 * - Blog and source code availability: http://www.huliqing.name/
 */

package com.springbblog.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.springbblog.domain.TagArticleEn;

/**
 *
 * @author huliqing
 */
public abstract class TagArticleDa extends BaseDao<TagArticleEn, Long>{

    public TagArticleDa() {
        super(TagArticleEn.class);
    }

    /**
     * 直接删除某篇文章的所有tag信息
     * @param articleId
     * @return
     */
    protected boolean deleteByArticleId(Long articleId) {
        if (articleId == null)
            throw new NullPointerException("articleId could not be null!");

        String q = "delete from TagArticleEn obj where obj.articleId=:articleId";
        EntityManager em = getEM();
        try {
            Query query = em.createQuery(q);
            query.setParameter("articleId", articleId);
            int result = query.executeUpdate();
            return (result >= 0);
        } finally {
            em.close();
        }
    }
}
