package com.jpaucruz.github.services;//package com.jpaucruz.github.services;

import com.jpaucruz.github.model.api.ArtistResponse;

import java.util.List;

public interface ArtistService {

  List<ArtistResponse> searchArtists();

}

