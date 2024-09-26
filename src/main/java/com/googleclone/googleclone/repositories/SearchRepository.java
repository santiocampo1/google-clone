package com.googleclone.googleclone.repositories;

import com.googleclone.googleclone.entities.WebPage;

import java.util.List;

public interface SearchRepository {

    List<WebPage> search(String textSearch);
}
